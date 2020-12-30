/*有一堆石头，每块石头的重量都是正整数。
* 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。
* 那么粉碎的可能结果如下：
* 如果 x == y，那么两块石头都会被完全粉碎；
* 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
* 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
*
* 输入：[2,7,4,1,8,1]
* 输出：1
* 解释：先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
* 再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
* 接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
* 最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。
* */

package easy_leetcode;

import java.util.Arrays;

public class stoneWeight {

    public static void main(String[] args){

        stoneWeight obj = new stoneWeight();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(obj.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones){

        int len = stones.length;
        if (len == 1){
            return stones[0];
        }
        while(len > 0) {
            Arrays.sort(stones);
            stones[stones.length - 2] = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 1] = 0;
            len --;
        }
        return stones[stones.length - 2];
    }
}
