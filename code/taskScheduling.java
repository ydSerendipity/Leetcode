package Leetcode;

import java.util.*;

public class taskScheduling {

    public static void main(String[] args){

        taskScheduling obj = new taskScheduling();
        int n = 2;
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println(obj.leastInterval(tasks, n));
    }

    public int leastInterval(char[] tasks, int n){

        //用一个hashmap来存所有的字符
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //获取最多的那个字符
        int max = 0;
        for (int i = 0;i < tasks.length;i++){
            int m = map.getOrDefault(tasks[i], 0) + 1;
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
            max = Math.max(max, m);
        }
        int count = 0;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry: entrySet){

            int value = entry.getValue();
            if(value == max){
                count++;
            }
        }
        return Math.max((max-1)*(n+1)+count, tasks.length);
    }
}
