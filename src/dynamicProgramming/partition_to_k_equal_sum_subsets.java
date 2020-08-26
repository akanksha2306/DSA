//package dynamicProgramming;
//
//import java.util.Arrays;
//
//public class partition_to_k_equal_sum_subsets {
//
//    public static boolean subsetSum(int []nums, int k){
//        //k = capacity
//        //nums = weight
//
//       int n = nums.length;
//        int[][]dp = new int[n+1][k+1];
//        //fill the dp with -1
//
//        for (int[] row : dp)
//            Arrays.fill(row, -1);
//
//        //smallest valid input
//        if ( nums.length != 0 && k == 0) {
//            return true;
//        }
//
//        if(nums.length ==0 && k !=0){
//            return false;
//        }
//
//        if(nums.length ==0 && k ==0){
//            return true;
//        }
//
//        //choice diagram
//
//        if(k>nums.length){
//
//        }
//        if(k<nums.length){
//
//        }
//
//        [nums.length-1],subsetSum([nums.length-1] , k-1);
//
//        //choice diagram
//
//    }
//}
