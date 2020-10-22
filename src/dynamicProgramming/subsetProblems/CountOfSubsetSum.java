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
        //when sum = 0,i can make sum =0,1,3,4...., if array-size =0,how? by taking null subset.
        for (int j = 0; j < n + 1; j++) {
            subset[j][0] = 1;
        }
        //subset[0][0] = 0;
        //whenever count is ask in a problem we add all the choices, like we have done here.
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

        int[] arr = new int[]{1, 2, 3,3};
        int sizeOfArray = arr.length;
        int sum = 6;
        CountOfSubsetSum cs = new CountOfSubsetSum();

        System.out.println(cs.count(arr, 6));

    }


}
