/*给定两个字符串 s 和 t，它们只包含小写字母
* 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
* 请找出在 t 中被添加的字母。
*
* 输入：s = "abcd", t = "abcde"
* 输出："e"
* 解释：'e' 是那个被添加的字母。
* */

package easy_leetcode;

import java.util.Arrays;

public class findDifferent {

    public static void main(String[] args){

        findDifferent obj = new findDifferent();
        String s = "abcd";
        String t = "abcde";
        System.out.println(obj.findTheDifference(s, t));
    }

    public char findTheDifference(String s, String t){

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0;i < a.length;i++){

            if (a[i] == b[i]){
                continue;
            }else {
                return b[i];
            }
        }
        return b[b.length - 1];
    }
}

