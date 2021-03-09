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

        char[] c = new char[length];
        int count = 0;
        for (int i = 0;i < length;i++){
            c[i] = s.charAt(i);
        }
        for (int j = 0;j < c.length;j++){
            if (c[j] == ' '){
                count++;
            }
        }
        String[] res = new String[length + count];
        for (int j = 0;j < res.length;j++){

            if (c[j] == ' '){
                res[j] = "%20";
            }
            res[j] = String.valueOf(c[j]);
        }
        return Arrays.toString(res);
    }
}
