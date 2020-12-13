package Test;

import java.util.Arrays;

public class k {
    public static void main(String[] args) {
        int[] org = new int[]{1, 2, 3};
        int[] original = Arrays.copyOf(org, 5);
        int[] copy = Arrays.copyOfRange(original, 0, 4);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
