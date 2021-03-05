/*给你一个二进制字符串数组 strs 和两个整数 m 和 n 。请你找出并返回 strs 的最大子集的大小，
* 该子集中 最多 有 m 个 0 和 n 个 1 。如果 x 的所有元素也是 y 的元素，集合 x 是集合 y 的 子集 。
*
* 输入：strs = ["10", "0001", "111001", "1", "0"], m = 5, n = 3
* 输出：4
* 解释：最多有 5 个 0 和 3 个 1 的最大子集是 {"10","0001","1","0"} ，因此答案是 4 。
* 其他满足题意但较小的子集包括 {"0001","1"} 和 {"10","1","0"} 。{"111001"} 不满足题
* 意，因为它含 4 个 1 ，大于 n 的值 3 。
* */

package KnapsackProblem;

public class onesAndZeros {

    public static void main(String[] args){

        onesAndZeros obj = new onesAndZeros();
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        System.out.println(obj.findMaxForm(strs, m, n));
    }

    public int findMaxForm(String[] strs, int m, int n){

        int[][] dp = new int[m + 1][n + 1];
        int max = 0;
        for (int i = 0;i < strs.length;i++){

            int[] c = countOnesZeros(strs[i]);
            for (int j = m;j >= c[0];j--){
                for (int k = n;k >= c[1];k--){
                    dp[j][k] = Math.max(1 + dp[j - c[0]][k - c[1]], dp[j][k]);
                    if (dp[j][k] > max){
                        max = dp[j][k];
                    }
                }
            }
        }
        return max;
    }

    public int[] countOnesZeros(String c){

        int[] num = new int[2];
        for (int i = 0;i < c.length();i++){
            if (c.charAt(i) == '0'){
                num[0]++;
            }
        }
        num[1] = c.length() - num[0];
        return num;
    }
}
