package dynamicProgramming.subStrings.longestRepeatingSubsequence;

public class LRS {

    //longestRepeatingSubsequence-its a longest repeating subsequence, means it will be discontinous
    //Repeating and should ne longest among many if many exists.

    static int lonRepSub(String x, String y) {
        int n = x.length();
        int m = y.length();
//
//        if (n != m) {
//            return 0;
//        }



        int[][] t = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            t[n][0] = 0;
        }
        for (int j = 0; j < m; j++) {
            t[0][m] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1) && i != j) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }

            }
        }
        return t[n][m];
    }

    public static void main(String[] args) {
        String x = "AABEBCDD";
        String y = "AABEBCDD";
        System.out.println(lonRepSub(x, y));
    }

}
//in subsequence order should be present, can be discontinous ho bhale hi