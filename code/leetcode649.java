/*Dota2 的世界里有两个阵营：Radiant(天辉)和 Dire(夜魇)
* Dota2 参议院由来自两派的参议员组成。现在参议院希望对一个 Dota2 游戏里的改变作出决定。
* 他们以一个基于轮为过程的投票进行。在每一轮中，每一位参议员都可以行使两项权利中的一项：
* 禁止一名参议员的权利：参议员可以让另一位参议员在这一轮和随后的几轮中丧失所有的权利。
* 宣布胜利：如果参议员发现有权利投票的参议员都是同一个阵营的，他可以宣布胜利并决定在游戏中的有关变化。
* 给定一个字符串代表每个参议员的阵营。字母 “R” 和 “D” 分别代表了Radiant（天辉）和Dire（夜魇）。然
* 后，如果有 n 个参议员，给定字符串的大小将是n。
* 以轮为基础的过程从给定顺序的第一个参议员开始到最后一个参议员结束。这一过程将持续到投票结束。
* 所有失去权利的参议员将在过程中被跳过。
* 假设每一位参议员都足够聪明，会为自己的政党做出最好的策略，你需要预测哪一方最终会宣布胜利并在 Dota2 游戏中决定改变。
* 输出应该是Radiant或Dire。
*
* 输入："RD"
* 输出："Radiant"
* 解释：第一个参议员来自 Radiant 阵营并且他可以使用第一项权利让第二个参议员失去权力，
* 因此第二个参议员将被跳过因为他没有任何权利。然后在第二轮的时候，第一个参议员可以宣布胜利，因为他是唯一一个有投票权的人
* */

package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode649 {

    public static void main(String[] args){

        leetcode649 obj = new leetcode649();
        String senate = "RDD";
        System.out.println(obj.predictPartyVictory(senate));
    }

    public String predictPartyVictory(String senate){

        Queue<Integer> radiant = new LinkedList<Integer>();
        Queue<Integer> dire = new LinkedList<Integer>();
        for (int i = 0;i < senate.length();i++){
            if (senate.charAt(i) == 'R'){
                radiant.offer(i);
            }else{
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()){

            int r = radiant.poll();
            int d = dire.poll();
            if (r < d){
                radiant.offer(r + senate.length());
            }else {
                dire.offer(d + senate.length());
            }
        }
        return !radiant.isEmpty()?"Radiant":"Dire";
    }
}
