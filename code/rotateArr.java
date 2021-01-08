/*给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
* 输入: [1,2,3,4,5,6,7] 和 k = 3
* 输出: [5,6,7,1,2,3,4]
*
* 解释: 向右旋转 1 步: [7,1,2,3,4,5,6]
* 向右旋转 2 步: [6,7,1,2,3,4,5]
* 向右旋转 3 步: [5,6,7,1,2,3,4]
* */

//第一想法就是这个，但是第一反应就是时间复杂度太高了，果不其然
//之后的想法就是翻转数组的那种了，复习的时候再写新的方法

package Leetcode;

import java.util.Arrays;

public class rotateArr {

    public static void main(String[] agrs){

        rotateArr obj = new rotateArr();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k){

        for (int i = 0;i < k;i++){

            int temp = nums[nums.length - 1];
            for (int j = 1;j < nums.length;j++){

                nums[nums.length - j] = nums[nums.length - j - 1];
            }
            nums[0] = temp;
        }
    }
}
