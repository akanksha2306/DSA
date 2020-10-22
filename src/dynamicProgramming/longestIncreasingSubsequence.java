package dynamicProgramming;

import java.util.Arrays;

public class longestIncreasingSubsequence {

    static int lis(int[] arr) {
        int n = arr.length;

        int[] lis = new int[n];

        Arrays.fill(lis, 1);//assuming that every element is lis in itself so we will fill up here with 1.
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if (arr[i] >= arr[j]) {
                    lis[i] = lis[j] + 1;
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for (int x : lis)
            max = Math.max(max, x);
        System.out.println("max is" + " "+ max);
        return max;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{50, 3, 10, 7, 40, 80};
        System.out.println(lis(arr));

    }

}

