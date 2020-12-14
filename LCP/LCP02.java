/*有一个同学在学习分式。他需要将一个连分数化成最简分数，你能帮助他吗？
* 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。
* 返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大公约数为1。
* */

package LCP;

import java.util.Arrays;

public class LCP02 {

    public static void main(String[] args){

        LCP02 obj = new LCP02();
        int[] cont = {3, 2, 0, 2};
        System.out.println(Arrays.toString(obj.fraction(cont)));
    }

    public int[] fraction(int[] cont){

        if (cont.length == 1){
            return new int[]{cont[0], 1};
        }
        if (cont.length == 2){
            return new int[]{cont[0] * cont[1] + 1, cont[1]};
        }
        int n = cont[cont.length - 1];
        int m = cont[cont.length - 2] * n + 1;
        for (int i = cont.length - 3;i >= 0;i--){

            int temp = m;
            m = cont[i] * m + n;
            n = temp;
        }
        return new int[]{m, n};
    }
}
