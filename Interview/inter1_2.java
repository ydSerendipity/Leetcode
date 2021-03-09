/*给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
*
* 输入: s1 = "abc", s2 = "bca"
* 输出: true
* */

package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class inter1_2 {

    public static void main(String[] args){

        inter1_2 obj = new inter1_2();
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(obj.CheckPermutation(s1, s2));
    }

    public boolean CheckPermutation(String s1, String s2){

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0;i < s1.length();i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int j = 0;j < s2.length();j++){
            map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j), 0) + 1);
        }
        return map1.equals(map2);
    }
}
