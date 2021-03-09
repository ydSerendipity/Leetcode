/*实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
*
* 输入: s = "leetcode"
* 输出: false
* */

package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class inter1_1 {

    public static void main(String[] args){

        inter1_1 obj = new inter1_1();
        String astr = "abcdefgh";
        System.out.println(obj.isUnique(astr));
    }

    public boolean isUnique(String astr){

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0;i < astr.length();i++){
            map.put(astr.charAt(i), map.getOrDefault(astr.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if (entry.getValue() != 1){
                return false;
            }
        }
        return true;
    }
}
