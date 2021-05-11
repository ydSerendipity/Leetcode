/*给你一个整数数组 perm ，它是前 n 个正整数的排列，且 n 是个 奇数 。
* 它被加密成另一个长度为 n - 1的整数数组encoded，满足encoded[i] = perm[i] XOR perm[i + 1]。
* 比方说，如果perm = [1,3,2]，那么encoded = [2,1]。
*
* 输入：encoded = [3,1]
* 输出：[1,2,3]
* 解释：如果 perm = [1,2,3] ，那么 encoded = [1 XOR 2,2 XOR 3] = [3,1]
* */

package Leetcode;

import java.util.Arrays;

public class DecoderXOR_II {

    public static void main(String[] args) {

        DecoderXOR_II obj = new DecoderXOR_II();
        int[] encoded = new int[]{6, 5, 4, 6};
        System.out.println(Arrays.toString(obj.decode(encoded)));
    }

    public int[] decode(int[] encoded){

        int len = encoded.length;
        int[] resv = new int[len + 1];
        //m记录resv中所有数异或的结果, n记录除了第一个数以外其他数异或结果
        int m = 0;int n = 0;
        for (int i = 1;i <= len + 1;i++){
            m ^= i;
        }
        for (int j = 1;j < len;j+=2){
            n ^= encoded[j];
        }
        resv[0] = m ^ n;
        for (int i = 1;i < len + 1;i++){
            resv[i] = resv[i - 1] ^ encoded[i - 1];
        }
        return resv;
    }
}
