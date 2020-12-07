/*
*有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
*移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
*在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
*返回尽可能高的分数。
*/


package Leetcode;

public class matrixFlip {

    public static void main(String[] args){

        matrixFlip obj = new matrixFlip();
//        int[][] A = {{0,0,1,1}, {1,0,1,0}, {1,1,0,0}};
        int[][] A = {{0, 1}, {1, 1}};
        System.out.println(obj.matrixScore(A));
    }

    public int matrixScore(int[][] A){

        //当每行的第一个不为1时，翻转整行
        for (int i = 0;i < A.length;i++){

            if(A[i][0] != 1){

                for (int j = 0;j < A[i].length;j++){

                    A[i][j] = 1 - A[i][j];
                }
            }
        }
        //循环列，当某一列的0比1多时，翻转整列
        for (int j = 0;j < A[0].length;j++){
            int count = 0;
            for (int i = 0;i < A.length;i++){

                if (A[i][j] == 0){
                    count++;
                }
            }
            if (count > A.length/2){

                for (int k = 0;k < A.length;k++){

                    A[k][j] = 1 - A[k][j];
                }
            }
        }
        int num = 0;
        for (int i = 0;i < A.length;i++){
            double r = 0;
            for (int j = 0;j < A[0].length;j++){

                if (A[i][j] != 0){
                    r += Math.pow(2, A[0].length-1-j);
                }
            }
            num += r;
        }
        return num;
    }
}
