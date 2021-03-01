/*给定一个整数数组nums，求出数组从索引i到j(i ≤ j)范围内元素的总和，包含 i、j 两点。实现 NumArray 类：
* NumArray(int[] nums) 使用数组 nums 初始化对象
* int sumRange(int i, int j) 返回数组 nums 从索引i到j（i≤j）范围内元素的总和，包含i、j两点
* （也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
*
*
* 输入：["NumArray", "sumRange", "sumRange", "sumRange"]
* [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
* 输出：[null, 1, -1, -3]
* */


package easy_leetcode;

public class RegionAndSearch {

    public static void main(String[] agrs){

        String[] str = {"NumArray", "sumRange", "sumRange", "sumRange"};
        int[][] arr = {{-2, 0, 3, -5, 2, -1}, {0, 2}, {2, 5}, {0, 5}};
        NumArray nums = new NumArray(arr[0]);
        System.out.println(nums.sumRange(0, 2));
        System.out.println(nums.sumRange(2, 5));
        System.out.println(nums.sumRange(0, 5));
    }
}

class NumArray{

    private int[] sum;
    public NumArray(int[] nums){

        sum = new int[nums.length + 1];
        if (nums == null) return;
        for (int i = 0;i < nums.length;i++) sum[i+1] = sum[i] + nums[i];
    }

    public int sumRange(int i, int j){
        return sum[j+1] - sum[i];
    }
}
