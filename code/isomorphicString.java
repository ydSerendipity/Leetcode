/*给定两个字符串 s 和 t，判断它们是否是同构的。
* 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
* 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
* 输入: s = "egg", t = "add"
* 输出: true
*
* *****同构字符串*****
* */

package easy_leetcode;

import java.util.HashMap;

public class isomorphicString {

    public static void main(String[] args){

        isomorphicString obj = new isomorphicString();
        String s = "ab";
        String t = "aa";
        System.out.println(obj.isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t){

        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();
        for (int i = 0;i < s.length();i++){
            if (s2t.containsKey(s.charAt(i))){

                if (s2t.get(s.charAt(i)).equals(t.charAt(i))){
                    continue;
                }else {
                    return false;
                }
            }
            if (t2s.containsKey(t.charAt(i))){

                if (t2s.get(t.charAt(i)).equals(s.charAt(i))){
                    continue;
                }else {
                    return false;
                }
            }
            s2t.put(s.charAt(i), t.charAt(i));
            t2s.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
