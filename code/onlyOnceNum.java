/*给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
*
* 输入: [2,2,1]
* 输出: 1
* */

package easy_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class onlyOnceNum {

    public static void main(String[] args){

        onlyOnceNum obj = new onlyOnceNum();
        int[] nums = {4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }

    public int singleNumber(int[] nums){
//        哈希
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0;i < nums.length;i++){
//            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
//            if (entry.getValue().equals(1)){
//                return entry.getKey();
//            }
//        }
//        return 0;

        //异或才是真大佬，其他数组都是两个，异或之后全部都是0，然后最后剩下一个单独一个的数字，与0异或是本身
        int r = nums[0];
        for (int i = 1;i < nums.length;i++){
            r ^= nums[i];
        }
        return r;
    }
}
