package sde_questions.arrays.kadanes;

public class MaximumSubArray {

//https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d
    public static int maxNum(int[]arr){
        int local_max = 0;
        int global_max= Integer.MIN_VALUE;


        for(int i=1; i<arr.length; i++){

            local_max= Math.max(arr[i], arr[i]+local_max);
            if(local_max>global_max){
                global_max= local_max;
            }


        }
        return global_max;
    }


}
