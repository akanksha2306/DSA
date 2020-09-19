package dynamicProgramming.subsetProblems;

import java.util.Arrays;

public class EqualSumPartition {

    public static boolean subSetSumEqualPartition(int[] arr) {

        int n = arr.length;


        int sum = 0;
        boolean ans;
        for (int i =0; i<n; i++) {
            sum = sum + arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        } else {
            ans=sumSubset(arr,sum/2);
            }
            return ans;

    }

    public static boolean sumSubset(int[] arr, int sum){

        int n = arr.length;
        boolean[][] subset = new boolean[n + 1][sum + 1];
        //i= n, j = sum;

        for (boolean[] row : subset)
            Arrays.fill(row, false);


        //when n is 0
        for (int j = 0; j < sum + 1; j++) {

            subset[0][j] = false;

        }
        //when sum = 0
        for (int i = 0; i < n + 1; i++) {

            subset[i][0] = true;

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

        int[] arr = new int[]{7,5,5,5};
        int sum = 11;
        int sizeOfArray = arr.length;

        System.out.println(subSetSumEqualPartition(arr));
    }

}
