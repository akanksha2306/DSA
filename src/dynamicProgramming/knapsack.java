package dynamicProgramming;

import java.util.Arrays;
//https://leetcode.com/discuss/general-discussion/662866/dp-for-beginners-problems-patterns-sample-solutions
public class knapsack {

    public static int zeroOneKnapsack(int[] wt, int[] value, int W, int n) {

        int[][] dp = new int[n + 1][W + 1];
        //fill the dp with -1

        for (int[] row : dp)
            Arrays.fill(row, -1);

        //base condition-think of the smallest valid input
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
         if (wt[n - 1] <= W) {
            return dp[n][W] = Math.max(value[n - 1] + zeroOneKnapsack(wt, value, W - wt[n - 1], n - 1),
                    zeroOneKnapsack(wt, value, W, n - 1));
        } else {
            return dp[n][W] = zeroOneKnapsack(wt, value, W, n - 1);
        }
    }

    public static void main(String[] args) {

        int[] value = new int[]{60, 100, 120};
        int[] weight = new int[]{10, 20, 30};
        int capacity = 50;
        int n = value.length;
        System.out.println(zeroOneKnapsack(weight, value, capacity, n));
    }

}

