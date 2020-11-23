/*在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。
由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束
坐标。一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，若有一个气球的直径的
开始和结束坐标为 Xstart，Xend， 且满足Xstart≤ x ≤ Xend，则该气球会被引爆。可以射出的弓箭
的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓
箭的最小数量。给你一个数组 points ，其中 points [i] = [xstart,xend] ，返回引爆所有气球
所必须射出的最小弓箭数。

eg:
input：points = [[10,16],[2,8],[1,6],[7,12]
output：2
解释：对于该样例，x = 6 可以射爆 [2,8],[1,6] 两个气球，以及 x = 11 射爆另外两个气球
*/

package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Boom {

    public static void main(String[] args){

        Boom obj = new Boom();
        int[][] points = {{-2147483646,-2147483645}, {2147483646,2147483647}};
        System.out.println(obj.findMinArrowShots(points));

    }

    public int findMinArrowShots(int[][] points){

        int arrow = 1;
        if(points.length < 0){
            return 0;
        }
//        if (points[0][0]==Math.pow(-2,31)+2&&points[0][1]==Math.pow(-2,31)+3&&points[1][0]==Math.pow(2,31)-2&&points[1][1]==Math.pow(2,31)-1){
//            return 2;
//        }
        //将二维数组points按照第二个数字的大小，从小到大排序
        Arrays.sort(points, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] < o2[1])
                    return -1;
                return 1;
            }
        });
        //记录排序后第二个坐标最小的 那个气球的 第二个坐标(断个句)
        int x = points[0][1];
        //当下一个气球的第一个坐标比x小时，说明在射爆第一个的时候也可以射爆下一个，反之则需要下一支箭
        //不用射爆气球的来讲，就是范围有交集的问题
        for (int i = 1;i < points.length;i++){
            if(points[i][0] > x){
                arrow++;
                x = points[i][1];
            }
        }
        return arrow;
    }
}
