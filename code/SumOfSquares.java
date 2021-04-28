/*给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
*
* 输入：c = 5
* 输出：true
* 解释：1 * 1 + 2 * 2 = 5
*
* 输入：c = 3
* 输出：false
* */

package Leetcode;

public class SumOfSquares {

    public static void main(String[] args) {

        SumOfSquares obj = new SumOfSquares();
        int c = 5;
        System.out.println(obj.judgeSquareSum(c));
    }

    public boolean judgeSquareSum(int c){

        int i = 0;
        int j = (int)Math.sqrt(c);
        while (i <= j){
            if (i*i + j*j > c){
                j--;
            }else if (i*i + j*j < c){
                i++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
