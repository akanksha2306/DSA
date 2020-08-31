package dynamicProgramming;

import java.util.Arrays;

public class lcsMemoization {

    static int lsc(String x, String y, int n, int m) {

        int[][] t = new int[n + 1][m + 1];

        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        if (n == 0 || m == 0) {
            return 0;
        }

        if (t[n][m] != -1) {
            return t[n][m];
        }

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            t[n][m] = 1 + lsc(x, y, n - 1, m - 1);
            return t[n][m];
        } else {
            t[n][m] = Math.max(lsc(x, y, n, m - 1), lsc(x, y, n - 1, m));
            return t[n][m];
        }

    }

    public static void main(String[] args) {
        String x = "ABCDGH";
        String y = "AEDFHR";
        System.out.println(lsc(x, y, 6, 6));
    }
}


