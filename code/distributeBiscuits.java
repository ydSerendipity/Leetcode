/*假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
* 对每个孩子i，都有一个胃口值g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
* 并且每块饼干j，都有一个尺寸 s[j]。如果 s[j]>= g[i]，我们可以将这个饼
* 干j分配给孩子i，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
*
* 输入: g = [1,2], s = [1,2,3]
* 输出: 2
* 解释: 你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。你拥有的饼干数量和尺寸都足以让所有孩子满足。所以你应该输出2.
* */


package easy_leetcode;

import java.util.Arrays;

public class distributeBiscuits {

    public static void main(String[] args){

        distributeBiscuits obj = new distributeBiscuits();
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        System.out.println(obj.findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s){

        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0, j = 0;i < g.length && j < s.length;){

            if (g[i] <= s[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
