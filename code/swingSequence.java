/*如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为摆动序列。
* 第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。
* 例如，[1,7,4,9,2,5] 是一个摆动序列，因为差值 (6,-3,5,-7,3)是正负交
* 替出现的。相反, [1,4,7,2,5]和[1,7,4,5,5] 不是摆动序列，第一个序列是
* 因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。
* 给定一个整数序列，返回作为摆动序列的最长子序列的长度。通过从原始序列中删除一些
* （也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。
* 输入: [1,7,4,9,2,5]
* 输出: 6
* 解释: 整个序列均为摆动序列。
* */

package Leetcode;

import java.util.ArrayList;

public class swingSequence {

    public static void main(String[] args){

        swingSequence obj = new swingSequence();
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(obj.wiggleMaxLength(nums));
    }

    public int wiggleMaxLength(int[] nums){

//        if (nums.length < 2){
//            return nums.length;
//        }
//        int up = 1;
//        int down = 1;
//        for (int i = 0;i < nums.length - 1;i++){
//            if (nums[i] < nums[i + 1]){
//                up = Math.max(up, down + 1);
//            }
//            if (nums[i] > nums[i + 1]){
//                down = Math.max(up + 1, down);
//            }
//        }
//        return Math.max(up, down);

        if (nums.length == 0){
            return 0;
        }
        ArrayList<Integer> l = new ArrayList<>();
        l.add(nums[0]);
        for (int i = 1;i < nums.length;i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            }
            l.add(nums[i]);
        }
        int len = l.size();
        if (len < 3){
            return len;
        }
        int[] dp = new int[len];
        dp[0] = 1;
        dp[1] = 2;
        for (int j = 2;j < len;j++){
            dp[j] = (((l.get(j)-l.get(j - 1))*(l.get(j - 1)-l.get(j - 2))) < 0)?dp[j-1]+1:dp[j-1];
        }
        return dp[len-1];
    }
}

