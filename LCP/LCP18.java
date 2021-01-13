/*小扣在秋日市集选择了一家早餐摊位，一维整型数组 staple 中记录了每种主食的价格，
* 一维整型数组 drinks 中记录了每种饮料的价格。小扣的计划选择一份主食和一款饮料，
* 且花费不超过 x 元。请返回小扣共有多少种购买方案。
*
* 输入：staple = [10,20,5], drinks = [5,5,2], x = 15
* 输出：6
* 解释：小扣有 8 种购买方案，所选主食与所选饮料在数组中对应的下标分别是：
* 第 1 种方案：staple[0] + drinks[2] = 2 + 5 = 7
* 第 2 种方案：staple[0] + drinks[3] = 2 + 1 = 3
* 第 3 种方案：staple[1] + drinks[0] = 1 + 8 = 9
* 第 4 种方案：staple[1] + drinks[2] = 1 + 5 = 6
* 第 5 种方案：staple[1] + drinks[3] = 1 + 1 = 2
* 第 6 种方案：staple[2] + drinks[0] = 1 + 8 = 9
* 第 7 种方案：staple[2] + drinks[2] = 1 + 5 = 6
* 第 8 种方案：staple[2] + drinks[3] = 1 + 1 = 2
* */


package LCP;

import java.util.Arrays;

public class LCP18 {

    public static void main(String[] agrs){

        LCP18 obj = new LCP18();
        int[] staple = {2,1,1};
        int[] drinks = {8,9,5,1};
        int x = 9;
        System.out.println(obj.breakfastNumber(staple, drinks, x));
    }

    public int breakfastNumber(int[] staple, int[] drinks, int x){


//        int count = 0;
//        for (int i = 0;i < staple.length;i++){
//
//            for (int j = 0;j < drinks.length;j++){
//
//                if (staple[i] + drinks[j] <= x){
//                    count++;
//                }
//            }
//        }
//        return count % 1000000007;

        long count = 0;
        int i = 0;
        long j = drinks.length - 1;
        Arrays.sort(staple);
        Arrays.sort(drinks);
        while(i < staple.length && j >= 0){
            if (staple[i] + drinks[(int)(j)] <= x){
                count += (j + 1);
                i++;
            }else{
                j--;
            }
        }
        return (int)(count % 1000000007);
    }
}
