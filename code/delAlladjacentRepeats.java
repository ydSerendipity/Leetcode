/*给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。在 S
* 上反复执行重复项删除操作，直到无法继续删除。在完成所有重复项删除操作后返回最终的字符串。答
* 案保证唯一。
*
* 输入："abbaca"
* 输出："ca"
* 解释：
* 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除
* 操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最
* 后的字符串为 "ca"。
* */

package easy_leetcode;

import java.util.Iterator;
import java.util.Stack;

public class delAlladjacentRepeats {

    public static void main(String[] args){

        delAlladjacentRepeats obj = new delAlladjacentRepeats();
        String S = "abbaca";
        System.out.println(obj.removeDuplicates(S));
    }

    public String removeDuplicates(String S){

        Stack<Character> stack = new Stack<>();
        String res = "";
        int len = S.length();
        for (int i = 0;i < len;i++){
            if (!stack.isEmpty() && stack.peek() == S.charAt(i)){
                stack.pop();
            }else{
                stack.push(S.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        return new StringBuffer(res).reverse().toString();
    }
}
