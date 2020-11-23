//给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
//input:"abcabcbb"
//output:3
//因为无重复字符的最长子串是 "abc"，所以其长度为 3。

package Leetcode;

public class noRepeatSubstring {

    public static void main(String[] args){

        noRepeatSubstring obj = new noRepeatSubstring();
        String s = "";
        System.out.print(obj.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s){

        //长度小于2直接返回本身
        if(s.length() < 2){
            return s.length();
        }
        //定义j用于指向数组的第二个元素
        int j = 1;
        //记录最大长度
        int max = 0;
        //循环给定的字符串
        for (int i = 0;i < s.length()&&j < s.length() + 1;){
            //定义一个新的字符串用于接受截取出来的字符串
            String new_s = s.substring(i,j);
            //判断截取的字符串是否重复，重复就将i右移一个，j不动，继续判断新的字符串是否重复
            if(Repeat(new_s)){
                i++;
            }else{
                //不重复则计算长度，更新最长的子串的长度
                if(j - i > max){
                    max = j - i;
                }
                //不重复则继续将j右移，i不动，再判断新字符串是否重复
                j++;
            }
        }
        return max;
    }

    //判断一个字符串是否含有相同的字符
    public boolean Repeat(String s){

        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            for (int j = i+1;j < s.length();j++){

                if(c == s.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}

