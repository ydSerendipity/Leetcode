/*0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。
* 求出这个圆圈里剩下的最后一个数字。
* 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，
* 因此最后剩下的数字是3。
*
* 输入: n = 5, m = 3
* 输出: 3
* */
package SwordFingerOffer;

import java.util.ArrayList;
import java.util.List;

public class sword64 {

    public static void main(String[] args){

        sword64 obj = new sword64();
        int n = 5;
        int m = 3;
        System.out.println(obj.lastRemaining(n, m));
    }

    public int lastRemaining(int n, int m){

        List<Integer> l = new ArrayList<>();
        for (int i = 0;i < n;i++){
            l.add(i);
        }
        int k = 0;
        for (int j = 1;j < n;j++){
            k = (k + m - 1) % l.size();
            l.remove(k);
        }
        return l.get(0);
    }
}
