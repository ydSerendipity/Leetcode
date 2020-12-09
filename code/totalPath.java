/*
* 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
*机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
*问总共有多少条不同的路径？
* */
//一个很明显的动态规划问题

package Leetcode;

public class totalPath {

    public static void main(String[] args){

        totalPath obj = new totalPath();
        int m = 7;
        int n = 3;
        System.out.println(obj.uniquePaths(m, n));
    }

    public int uniquePaths(int m, int n){

        int[][] dp = new int[m][n];
        //机器人只向右移动时
        for (int i = 0;i < m;i++){
            dp[i][0] = 1;
        }
        //机器人只向下移动时
        for (int j = 0;j < n;j++){
            dp[0][j] = 1;
        }
        //找出到终点的步数与终点前一步之间的关系
        for (int i = 1;i < m;i++){
            for (int j = 1;j < n;j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }
}
