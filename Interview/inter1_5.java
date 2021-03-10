/*字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定
* 它们是否只需要一次(或者零次)编辑。
*
* 输入:
* first = "pale"
* second = "ple"
* 输出: True
* */

package Interview;

import java.awt.event.MouseAdapter;
import java.util.Map;

public class inter1_5 {

    public static void main(String[] args){

        inter1_5 obj = new inter1_5();
        String first = "teacher";
        String second = "beacher";
        System.out.println(obj.oneEditAway(first, second));
    }

    public boolean oneEditAway(String first, String second){

        int len_f = first.length();
        int len_s = second.length();
        if (Math.abs(len_f - len_s) > 1){
            return false;
        }
        if (len_f == len_s){
            int count = 0;
            for (int i = 0;i < len_f;i++){
                if (first.charAt(i) != second.charAt(i)) count++;
            }
            if (count > 1) return false;
        }else {
            if (len_f > len_s){
                String temp = first;
                first = second;
                second = temp;
            }
            int count = 0, f = 0, s = 0;
            while (f < first.length() && s < second.length()){
                if (first.charAt(f) == second.charAt(s)){
                    f++;
                    s++;
                }else {
                    count++;
                    s++;
                }
            }
            if (count > 1){
                return false;
            }
        }
        return true;
    }
}
