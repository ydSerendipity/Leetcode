/*给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
*
* 输入: 2
* 输出: [0,1,1]
*
* 输入: 5
* 输出: [0,1,1,2,1,2]
* */

package Leetcode;

public class bitCount {

    public static void main(String[] args){

        bitCount obj = new bitCount();
        int num = 5;
        int[] res = obj.countBits(num);
        for (int i = 0;i < res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

    public int[] countBits(int num){
        int[] res = new int[num + 1];
        res[0] = 0;
        for (int i = 1;i <= num;i++){

            res[i] = numOfOne(getBinary(i));
        }
        return res;
    }

    //这里因为计算1的个数，只需要取str即可(求二进制结果需要将str翻转)
    public String getBinary(int n){

        String str = "";
        while(n != 0){
            str = str + n % 2;
            n /= 2;
        }
        return str;
    }

    //统计str中1的个数
    public int numOfOne(String str){

        int count = 0;
        for (int i = 0;i < str.length();i++){

            if (str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
