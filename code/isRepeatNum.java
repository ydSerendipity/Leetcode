/*给定一个整数数组，判断是否存在重复元素。
* 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
* 输入: [1,2,3,1]
* 输出: true
*/

package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class isRepeatNum {

    public static void main(String[] args){

        isRepeatNum obj = new isRepeatNum();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(obj.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums){

        HashSet<Integer> map = new HashSet<Integer>();
        for (int i = 0;i < nums.length;i++){

            if (!map.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}
