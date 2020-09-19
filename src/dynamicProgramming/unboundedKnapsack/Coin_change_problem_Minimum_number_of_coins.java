//package dynamicProgramming.unboundedKnapsack;
//
//public class Coin_change_problem_Minimum_number_of_coins {
//
//    public static int minimumCoinChangeProblem(int[] coinArray, int sum){
//        int n = coinArray.length;
//
//         int[][] T  = new int[n+1][sum+1];
//        T[0][0] = Integer.MAX_VALUE-1;
//
//
//        //initialization
//        //now when ARRAY IS EMPTY and we want the minimumsum = 1,2,3,4;
//
//        //we dont have coins(coin =0) to choose, but we want sum=1,2,3,... so we need infinite number of coins to make sum =1,2...
//        //infinite = INT_MAX -1
//
////array empty and sum =0 , now tell minimum number of coins,infinite number will be needed
//        for(int j =1; j<n+1; j++){
//            T[0][j] = Integer.MAX_VALUE-1;
//
//        }
//        //coins=1,2,3..., sum =0,so if we want sum 0, then number of minimum coins needed will also be =0 or minimum. even though coins given is
//        //1,2,4....since we want sum =0, so how many coins will be needed? =0 only, no coins needed to make sum 0.
//        //0 coins will give 0 sum
//
//        for(int j =1; j<sum+1; j++){
//            T[j][0] = 0;
//
//        }
//
//
//
//    }
//}
