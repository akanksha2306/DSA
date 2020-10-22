package dynamicProgramming.subStrings;

public class longestCommonSubstring {
    static int lcs(String x, String y, int n, int m) {

        //base condition

        int[][] t = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            t[n][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            t[0][m] = 0;
        }

        int result = 0;
//        if(n ==0 || m ==0){
//            return 0;
//        }

        //choice diagram
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    result = Math.max(0, t[i][j]);
                } else {
                    t[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String x = "babad";
        String y = "dabab";
        System.out.println(lcs(x, y, 5, 5));
    }
}