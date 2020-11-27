package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class fourNumSumZero {

    public static void main(String[] args){

        fourNumSumZero obj = new fourNumSumZero();
        int[] A = {-1, -1};
        int[] B = {-1, 1};
        int[] C = {-1, 1};
        int[] D = {1, -1};
        System.out.println(obj.fourSumCount(A, B, C, D));
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D){

        int len = A.length;
        int count = 0;
//        ArrayList<Integer> l = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < len;i++){
            for (int j = 0;j < len;j++){
                int sum = A[i]+B[j];
//                if(map.containsKey(sum)){
//                    map.put(sum, map.get(sum)+1);
//                }else {
//                    map.put(sum, 1);
//                }
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        for (int k = 0;k < len;k++){
            for (int l = 0;l < len;l++){
                int r = C[k] + D[l];
                if(map.containsKey(-r)){
                    count += map.get(-r);
                }
            }
        }
        return count;
    }
}
