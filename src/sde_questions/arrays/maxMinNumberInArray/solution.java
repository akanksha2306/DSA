package sde_questions.arrays.maxMinNumberInArray;

public class solution {

    public static int minMax(int arr[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }

        return min;
    }
}
