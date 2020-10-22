package dynamicProgramming.matrixChainMultiplication;

import java.util.Arrays;

public class McmRecursive {
    /**
     * https://www.youtube.com/watch?v=D7AFvtnDeMU&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=33
     * we will be given array or string,
     * base condition of recursion-think of the smallest valid input and smallest invalid input
     * int[]arr, int i, int j and there is int k moves from i to j;
     * if i == j then there is only one element in array
     * if i>=j - means there is no element in the array-invalid input,size of array is 0
     * if i==j that means only 1 element in array.size 1 array, is also invalid- becoz
     * if i calculate A[i] = A[i-1][i], so in that case A[i-1] = A[0-1]= A[-1]
     * if i<j;
     * i=1,j = n-1; A1 =
     * we have to break i on every k, so for doing this we will put a loop
     *we will move k from i to j and will keep calculating the temporary answers at every step and
     * will store everything and calculate the max from there.
     * **/

    /**
     * there are 2 schemes to be used here-
     * 1) k = i to k = j-1, function call -->i to k and k+1 to j;
     * 2) k = i+1 to k = j ,function call --> i to k-1 and k to j;
     *
     * FORMAT
     * 1-find i and j
     * 2-find base condition
     * 3-k loop find karo
     * 4-add up the temporary answers
     **/



    //fill the dp with -1


    static int solve(int[] arr, int i, int j, int[][] dp) {
        //steps-1-find i and j values, 2- find right base conditions, 3-move k--> i to j
        //base condition


        if (i >= j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        //
        int min = (int) 1e10;

        for (int k = i; k <= j - 1; k++) {
            int tempans1 = solve(arr, i, k, dp) + solve(arr, k + 1, j, dp) + (arr[i - 1] * arr[k] * arr[j]);

            if (tempans1 < min) {
                min = tempans1;
            }

        }
        dp[i][j] = min;
        return dp[i][j];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{40, 20, 30, 10, 30};
        int i = arr.length;

        int[][] dp = new int[i + 1][i + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(solve(arr, 1, arr.length - 1, dp));
    }
}