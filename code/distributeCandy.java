/*老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
* 你需要按照以下要求，帮助老师给这些孩子分发糖果：
* 每个孩子至少分配到 1 个糖果
* 相邻的孩子中，评分高的孩子必须获得更多的糖果。
* 那么这样下来，老师至少需要准备多少颗糖果呢？
* 输入: [1,0,2]
* 输出: 5
* 解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
* */


package hard_leetcode;

import java.util.Arrays;

public class distributeCandy {

    public static void main(String[] args){

        distributeCandy obj = new distributeCandy();
        int[] ratings = {1,3,4,5,2};
        System.out.println(obj.candy(ratings));
    }

    public int candy(int[] ratings){

        int[] count = new int[ratings.length];
        int sum = 0;
        Arrays.fill(count, 1);
//        for (int i = 0;i < ratings.length;i++){
//            count[i] = 1;
//        }
        for (int j = 1;j < ratings.length;j++){
            if (ratings[j - 1] < ratings[j]){
                count[j] = count[j - 1] + 1;
            }
        }
        for (int k = ratings.length - 1;k > 0;k--){
            if (ratings[k - 1] > ratings[k]){
                if (count[k - 1] > count[k]){
                    continue;
                }
                count[k - 1] = count[k] + 1;
            }
        }
        for (int i = 0;i < count.length;i++){
            sum += count[i];
        }
        return sum;
    }
}
