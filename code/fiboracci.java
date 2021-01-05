/*斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。
* 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
* F(0) = 0，F(1) = 1
* F(n) = F(n - 1) + F(n - 2)，其中 n > 1
* 给你 n ，请计算 F(n) 。
*
* 输入：2
* 输出：1
* 解释：F(2) = F(1) + F(0) = 1 + 0 = 1
* */


package easy_leetcode;

public class fiboracci {

    public static void main(String[] args){

        fiboracci obj = new fiboracci();
        int n = 10;
        System.out.println(obj.fib(n));
    }

    public int fib(int n){

        if (n < 2) return n;
        int r = 1;int cur = 0;int pre = 0;
        for (int i = 2;i <= n;i++){
            pre = cur;
            cur = r;
            r = pre + cur;
        }
        return r;
    }
}