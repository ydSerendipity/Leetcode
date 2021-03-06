/*给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
*
* 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
* 输出：6
* 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
*
* 输入：nums = [1]
* 输出：1
* */

package KnapsackProblem;

public class maxSumSuborder {

    public static void main(String[] args){

        maxSumSuborder obj = new maxSumSuborder();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSumArray(nums));
    }

    public int maxSumArray(int[] nums){

        int max = nums[0];
        int temp = 0;
        int len = nums.length;
        for (int i = 0;i < len;i++){
            temp = Math.max(nums[i], temp + nums[i]);
            max = Math.max(max, temp);
        }
        return max;
    }
}
