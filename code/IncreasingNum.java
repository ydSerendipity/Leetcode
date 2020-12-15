/*给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
* （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
* 输入: N = 332
* 输出: 299
* */

package Leetcode;

public class IncreasingNum {

    //还是依然，第一反应出来的方法就爆掉了
//    public static void main(String[] args){
//
//        IncreasingNum obj = new IncreasingNum();
//        int N = 273070984;
//        System.out.println(obj.monotoneIncreasingDigits(N));
//    }
//
//    public int monotoneIncreasingDigits(int N){
//
//        for (int n = N;n > 0;n--){
//
//            String s = n + "";
//            int[] nums = new int[s.length()];
//            for (int i = 0;i < s.length();i++){
//
//                nums[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
//            }
//            if (nums.length == 1){
//                return nums[0];
//            }
//            for (int j = 0;j < nums.length - 1;){
//                if (nums[j] <= nums[j + 1]){
//                    j++;
//                    if (j == nums.length - 1){
//                        return cal(nums);
//                    }
//                }else {
//                    break;
//                }
//            }
//        }
//        return 0;
//    }
//
//    public int cal(int[] nums){
//
//        int r = 0;
//        for (int i = 0;i < nums.length;i++){
//            r += nums[i] * Math.pow(10, nums.length - i - 1);
//        }
//        return r;
//    }

    public static void main(String[] args){

        IncreasingNum obj = new IncreasingNum();
        int N = 332;
        System.out.println(obj.monotoneIncreasingDigits(N));
    }

    public int monotoneIncreasingDigits(int N){

        char[] ch = Integer.toString(N).toCharArray();
        //如果存在相同的数字，则记录最开始的那个数字方便后续操作
        int max = 0;
        int id = 0;
        for (int i = 0;i < ch.length - 1;i++){

            if (ch[i] > max){
                max = ch[i];
                id = i;
            }
            if (ch[i] > ch[i + 1]) {
                ch[id]--;
                for (int j = id + 1; j < ch.length; j++) {
                    ch[j] = '9';
                }
            }
        }
        return Integer.parseInt(new String(ch));
    }
}


