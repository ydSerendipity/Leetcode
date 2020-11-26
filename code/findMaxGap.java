/*给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。如果数组元素个数小于 2，则返回 0。*/
/*
*输入：[3,6,9,1]
*输出：3
*解释：排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 */

package Leetcode;

import java.util.Arrays;

public class findMaxGap {

    public static void main(String[] args){

        findMaxGap obj = new findMaxGap();
        int[] num = {9, 6, 3, 8, 22, 0};
        System.out.println(obj.maximumGap(num));
    }

    public int maximumGap(int[] nums){

        int maxGap = 0;
        if(nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0;i < nums.length-1;i++){

            int gap = nums[i+1] - nums[i];
            if(gap > maxGap){
                maxGap = gap;
            }
        }
        return maxGap;
    }
}
