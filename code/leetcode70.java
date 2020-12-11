/*假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
* 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
* 注意：给定 n 是一个正整数。
* 输入： 3
* 输出： 3
* 解释： 有三种方法可以爬到楼顶。
* 1.  1 阶 + 1 阶 + 1 阶
* 2.  1 阶 + 2 阶
* 3.  2 阶 + 1 阶
* */

package Leetcode;

public class leetcode70 {

    public static void main(String[] args){

        leetcode70 obj = new leetcode70();
        int n = 45;
        System.out.println(obj.climbStairs(n));

    }
    //因为递归会超时，这里找规律可以发现f(n)=f(n-1)+f(n-2)
    //所以只需要记录两个值即可
    public int climbStairs(int n){

        int r = 0;
        int t1 = 1;
        int t2 = 2;
        if (n < 3){
            return n;
        }
        for (int i = 3;i <= n;i++){
            r = t1 + t2;
            t1 = t2;
            t2 = r;
        }
        return r;
    }
}
