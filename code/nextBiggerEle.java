/*给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
* 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循
* 环地搜索它的下一个更大的数。如果不存在，则输出 -1。
*
* 输入: [1,2,1]
* 输出: [2,-1,2]
* 解释: 第一个 1 的下一个更大的数是 2；
* 数字 2 找不到下一个更大的数；
* 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
* */

package Leetcode;

public class nextBiggerEle {

    public static void main(String[] args){

        nextBiggerEle obj = new nextBiggerEle();
        int[] nums = {1, 2, 1};
        int[] res = obj.nextGreaterElements(nums);
        for (int i = 0;i < res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

    public int[] nextGreaterElements(int[] nums){

        int n = nums.length;
        if (n == 1){
            return new int[]{-1};
        }
        int[] res =  new int[n];
        for (int i = 0;i < n;i++){

            for (int j = i + 1;j < n;j++){
                if (nums[j] > nums[i]){
                    res[i] = nums[j];
                    break;
                }
                if (j == n - 1){
                    for (int k = 0;k <= i;k++){
                        if (nums[k] > nums[i]){
                            res[i] = nums[k];
                            break;
                        }
                        res[i] = -1;
                    }
                }
            }
            if (i == n - 1){
                for (int j = 0;j < i;j++){
                    if (nums[j] > nums[i]){
                        res[i] = nums[j];
                        break;
                    }
                    res[i] = -1;
                }
            }

        }
        return res;
    }
}
