package Leetcode;

public class maxWater {

    public static void main(String[] args){

        maxWater obj = new maxWater();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }

    public int maxArea(int[] height){

//        int max = 0;
//        for (int i = 0;i < height.length - 1;i++){
//            for (int j = i + 1;j < height.length;j++){
//
//                int area = (j - i) * Math.min(height[i], height[j]);
//                if (area > max){
//                    max = area;
//                }
//            }
//        }
//        return max;
        int low = 0;
        int high = height.length - 1;
        int area = 0;
        int max = 0;
        while (low < high){
            if (height[low] < height[high]){
                area = height[low] * (high - low);
                low++;
            }else {
                area = height[high] * (high - low);
                high--;
            }
            if (area > max){
                max = area;
            }
        }
        return max;
   }

}
