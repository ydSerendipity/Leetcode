/*给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
* 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
* 例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
*
* 输入：nums = [10,9,2,5,3,7,101,18]
* 输出：4
* 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
*
* 输入：nums = [7,7,7,7,7,7,7]
* 输出：1
* */

package KnapsackProblem;

public class maxLenSubsequence {

    public static void main(String[] args){

        maxLenSubsequence obj = new maxLenSubsequence();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(obj.lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums){

        if (nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for (int i = 1;i < nums.length;i++){
            dp[i] = 1;
            for (int j = 0;j < i;j++){
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
