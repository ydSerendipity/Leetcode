/*给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
* s = "leetcode"
* 返回 0

* s = "loveleetcode"
* 返回 2
 */

package easy_leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNoRepeat {

    public static void main(String[] args){

        firstNoRepeat obj = new firstNoRepeat();
        String s = "leetcode";
        System.out.println(obj.firstUniqChar(s));
    }

    public int firstUniqChar(String s){

        char[] c = s.toCharArray();
        char temp = ' ';
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0;i < c.length;i++){

            map.put(c[i], map.getOrDefault(c[i], 0) + 1);
        }
        for (Map.Entry entry:map.entrySet()){

            if ((int)(entry.getValue()) == 1){
                temp = (char)(entry.getKey());
                break;
            }
        }
        for (int i = 0;i < c.length;i++){
            if (c[i] == temp){
                return i;
            }
        }
        return -1;
    }
}
