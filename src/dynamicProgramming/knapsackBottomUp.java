package dynamicProgramming;

public class knapsackBottomUp {
    public static int zeroOneKnapsack(int[] wt, int[] value, int W, int n) {
//n is size of the array.
        //whatever is changing we take that as n+1 andW+1

        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {

        int[] value = new int[]{60, 100, 120};
        int[] weight = new int[]{10, 20, 30};
        int capacity = 50;
        int n = value.length;

        System.out.println(zeroOneKnapsack(weight, value, capacity, n));
    }

}
