package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class wordRules {

    public static void main(String[] args){

        wordRules obj = new wordRules();
        String pattern = "abab";
        String s = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern, s));
    }

    public boolean wordPattern(String pattern, String s){

        String[] word = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (word.length != pattern.length()){
            return false;
        }
        for (int i = 0;i < pattern.length();i++){

            if (!map.containsKey(pattern.charAt(i))){
                if (!map.containsValue(word[i])){
                    map.put(pattern.charAt(i), word[i]);
                }else {
                    return false;
                }
            }
            if (!map.get(pattern.charAt(i)).equals(word[i])){
                return false;
            }
        }

        return true;
    }
}
