/*给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
* 注意:可以认为区间的终点总是大于它的起点。区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
* 输入: [ [1,2], [2,3], [3,4], [1,3] ]
* 输出: 1
* 解释: 移除 [1,3] 后，剩下的区间没有重叠。
* */

package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class noOverlapSection {

    public static void main(String[] args){

        noOverlapSection obj = new noOverlapSection();
        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        System.out.println(obj.eraseOverlapIntervals(intervals));
    }

    public int eraseOverlapIntervals(int[][] intervals){

        int count = 1;
        if (intervals.length <= 0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int x = intervals[0][1];
        for (int i = 1;i < intervals.length;i++){
            if (intervals[i][0] >= x){
                count++;
                x = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}
