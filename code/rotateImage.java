/*给定一个 n × n 的二维矩阵表示一个图像。将图像顺时针旋转 90 度。
*给定 matrix =
* [
*   [1,2,3],
*   [4,5,6],
*   [7,8,9]
* ],
* 原地旋转输入矩阵，使其变为:
* [
*   [7,4,1],
*   [8,5,2],
*   [9,6,3]
* ]
* */


package Leetcode;

import java.util.Arrays;

public class rotateImage {

    public static void main(String[] args){

        rotateImage obj = new rotateImage();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        obj.rotate(matrix);
        for (int[] line:matrix){
            System.out.println(Arrays.toString(line));
        }
    }

    public void rotate(int[][] matrix){

        //矩阵水平翻转
        for (int i = 0;i < matrix.length / 2;i++){

            for (int j = 0;j < matrix.length;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i - 1][j] = temp;
            }
        }

        //矩阵沿主对角线翻转
        for (int i = 0;i < matrix.length;i++){

            for (int j = 0;j < i;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
