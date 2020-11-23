//将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
//比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
/*
L   C   I   R
E T O E S I I G
E   D   H   N
*/
package Leetcode;

public class Type_Z {

    public String convert(String s, int numRows){

        //用于接受最后输出的连接后的字符串
        String result = "";
        //定义flag，当达到数组边界是取反
        int j = 0, flag = 1;
        //定义一个字符串数组，大小等于要求写成的行数
        String[] newArr = new String[numRows];
        if(numRows == 1){
            return s;
        }
        //循环字符串，按顺序将字符串依次填入字符串数组
        for(int i = 0;i < s.length();i++)
        {
            if(newArr[j] != null){
                newArr[j] += s.charAt(i) + "";
            }else {
                newArr[j] = s.charAt(i) + "";
            }
            j += flag;
            if(j == numRows-1 || j ==0){
                flag = -flag;
            }
        }

        for(int k = 0;k < newArr.length;k++){

            if(newArr[k] == null){
                break;
            }
            result += newArr[k];
        }
        return result;
    }

    public static void main(String[] args){

        Type_Z obj = new Type_Z();
        String s = "ABHVJFKDIS";
        int numRows = 2;
        System.out.print(obj.convert(s, numRows));
    }
}
