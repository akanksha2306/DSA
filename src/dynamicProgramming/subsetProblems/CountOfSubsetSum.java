package dynamicProgramming.subsetProblems;

import java.util.Arrays;

public class CountOfSubsetSum {

    public  int count(int[] arr, int sum) {
        int n = arr.length;
        int[][] subset = new int[n + 1][sum + 1];
        //i= n, j = sum;
        for (int[] row : subset)
            Arrays.fill(row, -1);
        //when n is 0
        for (int i = 0; i < sum + 1; i++) {
            subset[0][i] = 0;
        }
        //when sum = 0
        for (int j = 0; j < n + 1; j++) {
            subset[j][0] = 1;
        }
        //subset[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    subset[i][j] = subset[i - 1][j - arr[i - 1]] + subset[i - 1][j];
                } else {
                    subset[i][j] = subset[i - 1][j];
                }
            }
        }
        return subset[n][sum];
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 2};
        int sizeOfArray = arr.length;
        int sum = 1;
        CountOfSubsetSum cs = new CountOfSubsetSum();

        System.out.println(cs.count(arr, 1));

    }


}
