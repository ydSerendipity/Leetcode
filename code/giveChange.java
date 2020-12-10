/*在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
* 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
* 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，
* 也就是说净交易是每位顾客向你支付 5 美元
* 注意，一开始你手头没有任何零钱。如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
* */

package Leetcode;

public class giveChange {

    public static void main(String[] args){

        giveChange obj = new giveChange();
        int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(obj.lemonadeChange(bills));
    }

    public boolean lemonadeChange(int[] bills){

        int count_5 = 0;
        int count_10 = 0;
        for (int i = 0;i < bills.length;i++){

            if (bills[i] == 5){
                count_5++;
            }
            if (bills[i] == 10){
                count_5--;
                count_10++;
                if (count_5 < 0){
                    return false;
                }
            }
            //这里如果手里没有10美元的可以用三个5美元来抵
            if (bills[i] == 20){
                if (count_10 < 1){
                    count_5 -= 3;
                }else {
                    count_5--;
                    count_10--;
                }
                if (count_5 < 0 || count_10 < 0){
                    return false;
                }
            }
        }
        return true;
    }
}
