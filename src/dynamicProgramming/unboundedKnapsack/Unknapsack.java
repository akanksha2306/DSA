package dynamicProgramming.unboundedKnapsack;

public class Unknapsack {

    public static int uk(int[] wt, int[] val, int W, int n) {

        n = wt.length;
        int[][] T = new int[n + 1][W + 1];


        //in unbounded Knapsack multiple occurance is allowed, one item can be picked more than one time


        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    T[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i - 1] <= j) {
                    T[i][j] = Math.max(val[i - 1] + T[i][j - wt[i - 1]], T[i - 1][j]);
                } else
                    T[i][j] = T[i - 1][j];
            }

        }
        return T[n][W];
    }

    public static void main(String[] args) {

        int[] value = new int[]{10,40,50,70};
        int[] wt = new int[]{1,3,4,5};
        int W = 8;
        int n = value.length;

        System.out.println(Unknapsack.uk(wt, value, W, n));
    }


}
