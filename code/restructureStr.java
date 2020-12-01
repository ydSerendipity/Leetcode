package Leetcode;

import com.sun.jdi.CharType;

import java.util.*;

public class restructureStr {

    public static void main(String[] args){

        restructureStr obj = new restructureStr();
        String S = "aabbbcdde";
        System.out.println(obj.reorganizeString(S));
    }

    public String reorganizeString(String S){

        if (S.length() == 0){
            return "";
        }
        //保存输出的字符串
        String[] reStr = new String[S.length()];
        //创建一个hash用来存字符串里面的字符
        HashMap<String, Integer> map = new HashMap<>();
        //将字符设为key，value是每个字符在字符串中的个数
        //下面这个操作就是计数操作
        for (int i = 0;i < S.length();i++){

            map.put(S.charAt(i) + "", (int)map.getOrDefault(S.charAt(i) + "", 0)+1);
        }
        //重写Collections.sort函数，将map中的key按照value的大小从大到小排序
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
//        System.out.println(list.getClass().getSimpleName());
        int count = 0;
        //保存输出字符串时的下标
        int idx = 0;
        //计数，找字符最多那个
        for (Map.Entry entry:map.entrySet()){
            if((int)entry.getValue() > count){
                count = (int)entry.getValue();
            }
//            System.out.println(entry.getValue());
        }
        //如果最多的字符超过S.length() + 1)/2就一定会有重复则按要求返回空
        if (count > (S.length() + 1)/2){
            return "";
        }
        //迭代排序后的list
        Iterator<Map.Entry<String, Integer>> iter = list.iterator();
        while (iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            //获取list中字符的个数
            int num = item.getValue();
            while (num > 0){
                //将字符按照个数填入接受的字符串数组，先按偶数位填
                reStr[idx] = item.getKey();
                idx += 2;
                num--;
                //第一遍填完之后再按奇数位填，保证不重复
                if(idx >= S.length()){
                    idx = 1;
                }
            }
        }
        //输出
        String s = "";
        for (int i = 0;i < reStr.length;i++){
            s += reStr[i];
        }
        return s;
    }
}


