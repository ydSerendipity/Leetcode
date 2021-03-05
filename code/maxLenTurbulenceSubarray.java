/*当 A 的子数组 A[i], A[i+1], ..., A[j] 满足下列条件时，我们称其为湍流子数组：
* 若 i <= k < j，当 k 为奇数时， A[k] > A[k+1]，且当 k 为偶数时，A[k] < A[k+1]；
* 或 若 i <= k < j，当 k 为偶数时，A[k] > A[k+1] ，且当 k 为奇数时， A[k] < A[k+1]。
* 也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。返回 A 的最大湍流子数组的长度。
*
* 输入：[9,4,2,10,7,8,8,1,9]
* 输出：5
* 解释：(A[1] > A[2] < A[3] > A[4] < A[5])
* */

package KnapsackProblem;

public class maxLenTurbulenceSubarray {

    public static void main(String[] args){

        maxLenTurbulenceSubarray obj = new maxLenTurbulenceSubarray();
        int[] arr = {9,4,2,10,7,8,8,1,9};
        System.out.println(obj.maxTurbulenceSize(arr));
    }

    public int maxTurbulenceSize(int[] arr){

        //注意是连续的数组
        //定义一个二维数组来保存状态dp[i][0]指第i个数据放入之后最后两个数是递减, dp[i][1]
        //是指第i个数放进去之后最后两个数处于递增
        int[][] dp = new int[arr.length][2];
        dp[0][0] = dp[0][1] = 1;
        for (int i = 1;i < arr.length;i++){
            dp[i][0] = dp[i][1] = 1;
            if (arr[i - 1] > arr[i]){
                dp[i][0] = dp[i - 1][1] + 1;
            }else if (arr[i - 1] < arr[i]){
                dp[i][1] = dp[i - 1][0] + 1;
            }
        }
        int r = 0;
        for (int i = 0;i < arr.length;i++){
            r = Math.max(dp[i][0], Math.max(r, dp[i][1]));
        }
        return r;
    }
}
