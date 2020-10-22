package dynamicProgramming.subStrings;
//Subsequence - order matters, there can be gap too between the words
//Substring - here continuation matters, there cant be discontinuity

public class longestCoSubsequenceTopDown {

    public static int topDown(String x, String y) {

        int n = x.length();
        int m = y.length();

        int[][] T = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            T[n][0] = 0;
        }
        for (int i = 0; i < m + 1; i++) {
            T[0][m] = 0;
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    T[i][j] = 1 + T[i - 1][j - 1];
                } else {
                    T[i][j] = Math.max(T[i][j - 1], T[i - 1][j]);
                }
            }
        }
        return T[n][m];
    }

    public static void main(String[] args) {
        String x = "agbcba";
        String y = "abcbga";
        System.out.println(topDown(x, y));
    }
}