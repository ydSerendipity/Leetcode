/*小扣注意到秋日市集上有一个创作黑白方格画的摊位。摊主给每个顾客提供一个固定在墙上的白色画板，
* 画板不能转动。画板上有 n * n 的网格。绘画规则为，小扣可以选择任意多行以及任意多列的格子涂
* 成黑色，所选行数、列数均可为 0。小扣希望最终的成品上需要有 k 个黑色格子，请返回小扣共有多
* 少种涂色方案。注意：两个方案中任意一个相同位置的格子颜色不同，就视为不同的方案。
*
* 输入：n = 2, k = 2
* 输出：4
* 解释：一共有四种不同的方案：
* 第一种方案：涂第一列；
* 第二种方案：涂第二列；
* 第三种方案：涂第一行；
* 第四种方案：涂第二行。
* */

package LCP;

public class LCP22 {

    public static void main(String[] args){

        LCP22 obj = new LCP22();
        int n = 4;int k = 12;
        System.out.println(obj.paintingPlan(n, k));
    }

    public int paintingPlan(int n, int k){

        if (k == n*n || k == 0){
            return 1;
        }
        if (k < n){
            return 0;
        }
        int r = 0;
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){

                int sum = n * i + n * j - i * j;
                if (sum == k){
                    int c1 = combination(n, i);
                    int c2 = combination(n, j);
                    r += c1 * c2;
                }
            }
        }
        return r;
    }

    //计算排列组合
    public int combination(int n, int m){

        return factorial(n)/(factorial(m)*factorial(n-m));
    }

    //计算阶乘
    public int factorial(int n){
        if (n <= 1) return 1;
        else return n*factorial(n - 1);
    }
}
