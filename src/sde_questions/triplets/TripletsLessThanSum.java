package sde_questions.triplets;

import java.util.Arrays;

public class TripletsLessThanSum {


    static int triplets(int[] arr, int k) {
        Arrays.sort(arr);

        int n = arr.length;
        int countLessThanK = 0;
        int countEqualToK = 0;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                if (arr[i] + arr[left] + arr[right] < k) {
                    countLessThanK = countLessThanK + right - left;
                    left++;

                }
                if (arr[i] + arr[left] + arr[right] >= k) {
                    right--;

                }
            }
        }
        System.out.println("countLessThanK" + countLessThanK);
        return countLessThanK;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 1, 3, 4, 7};
        int k = 12;

        int ans = triplets(arr, 12);
        System.out.println(ans);
    }
}
