package Leetcode;

public class findMedian {


    public static void main(String[] args){

        findMedian obj = new findMedian();
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        System.out.println(obj.findMedianSortedArrays(num1, num2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2){

        if(nums1.length == 0){
            return Median(nums2);
        }else if(nums1.length == 0){
            return Median(nums1);
        }else{

            int[] num = combineList(nums1, nums2);
            return Median(num);
        }
    }

    public double Median(int[] num){

        int len = num.length;
        if(len % 2 == 0){
            return (double)(num[len/2 - 1] + num[len/2])/2.0;
        }else{
            return num[len/2];
        }
    }

    public int[] combineList(int[] num1, int[] num2){

        int m = num1.length;
        int n = num2.length;
        int a = 0;
        int b = 0;
        int[] num3 = new int[m + n];
        for(int i = 0;i < num3.length;i++){

            if(a < m && b < n){
                if(num1[a] <= num2[b]){
                    num3[i] = num1[a];
                    a++;
                }else{
                    num3[i] = num2[b];
                    b++;
                }
            }else if(a < m){
                num3[i] = num1[a];
                a++;
            }else if(b < n){
                num3[i] = num2[b];
                b++;
            }
        }
        return num3;
    }
}
