/*字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
* 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则
* 返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
*
* 输入："aabcccccaaa"
* 输出："a2b1c5a3"
*
* 输入："abbccd"
* 输出："abbccd"
* 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
* */

package Interview;

public class inter1_6 {

    public static void main(String[] args){

        inter1_6 obj = new inter1_6();
        String S = "bb";
        System.out.println(obj.compressString(S));
    }

    public String compressString(String S){

        if (S.length() == 0){
            return S;
        }
        String res = "";
        char c = S.charAt(0);
        int count = 1;
        for (int i = 1;i < S.length();i++){
            if (c == S.charAt(i)){
                count++;
            }else {
                res += c + "" + count + "";
                c = S.charAt(i);
                count = 1;
            }
        }
        res += c + "" + count + "";
        return res.length()<S.length()?res:S;
    }
}
