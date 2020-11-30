package sde_questions.arrays.twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class sum {
//2,3,4,6,7


    static int[] two_sum(int[]arr, int x){
        //use this when array is sorted
        int i =0;
        int j = arr.length -1;

        while(i<j){
            if(arr[i] + arr[j]>x){
                j--;
            }else if(arr[i] + arr[j]<x)
                i++;
            else
                return new int[]{i, j};
        }

        return new int[]{-1, -1};

    }
    //TimeComplexity = o(1),We traverse the list containing nnn elements only once.
    //Each look up in the table costs only o(1) time.
    //Space - o(1);

    static int[] two_Sum(int []arr, int x){

        //2,3,4,7,9
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            int m = x-arr[i];
            if(hm.containsKey(m)){
                return new int[]{hm.get(m),i};
            }else
                hm.put(arr[i],i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[]arr = new int[]{2,3,4,7,9};
        int[]ans = two_sum(arr,7);
        System.out.println(Arrays.toString(ans));

    }

}
