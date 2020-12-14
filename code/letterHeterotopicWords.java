/*给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
* 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
* 输出:
* [
*   ["ate","eat","tea"],
*   ["nat","tan"],
*   ["bat"]
* ]
* */

package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//字母异位词
public class letterHeterotopicWords {

    public static void main(String[] args){

        letterHeterotopicWords obj = new letterHeterotopicWords();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(obj.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0;i < strs.length;i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            //将排序后的字符串作为hashmap的key
            String key = new String(str);
            List<String> value = map.getOrDefault(key, new ArrayList<String>());
            value.add(strs[i]);
            map.put(key, value);
        }
        return new ArrayList<>(map.values());
    }
}
