package dynamicProgramming;

import java.util.Arrays;

public class subsetSum {

    public static boolean sumSubset(int[] arr, int sum) {

        int n = arr.length;
        boolean[][] subset = new boolean[n + 1][sum + 1];
        //i= n, j = sum;

        for (boolean[] row : subset)
            Arrays.fill(row, false);


        //when n is 0
        for (int i = 0; i < sum + 1; i++) {

            subset[0][i] = false;

        }
        //when sum = 0
        for (int j = 0; j < n + 1; j++) {

            subset[j][0] = true;

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    subset[i][j] = subset[i-1][j - arr[i - 1]] || subset[i - 1][j];
                } else {
                    subset[i][j] = subset[i - 1][j];
                }
            }
        }
        return subset[n][sum];
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3, 0,1 };
        int sum = 11;
        int sizeOfArray = arr.length;

        System.out.println(sumSubset(arr, 11));
    }

}