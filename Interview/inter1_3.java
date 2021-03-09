/*URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，
* 并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
*
* 输入："Mr John Smith    ", 13
* 输出："Mr%20John%20Smith"
* */

package Interview;

import java.util.Arrays;

public class inter1_3 {

    public static void main(String[] args){

        inter1_3 obj = new inter1_3();
        String s = "Mr John Smith    ";
        int length = 13;
        System.out.println(obj.replaceSpaces(s, length));
    }

    public String replaceSpaces(String s, int length){

        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < length;i++){
            if (s.charAt(i) == ' '){
                sb.append('%');
                sb.append('2');
                sb.append('0');
            }else{
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
