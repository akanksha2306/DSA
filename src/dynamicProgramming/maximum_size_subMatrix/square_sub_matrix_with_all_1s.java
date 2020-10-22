package dynamicProgramming.maximum_size_subMatrix;

public class square_sub_matrix_with_all_1s {


    static int printMaxSubSquare(int[][] mat) {

        int[][] dp = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            dp[i][0] = mat[i][0];
        }

        for (int i = 0; i < mat[0].length; i++) {
            dp[0][i] = mat[0][i];
        }

        int maxSquareSize = Integer.MIN_VALUE;

        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {

                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));

                    maxSquareSize = Math.max(maxSquareSize, dp[i][j]);
                }
            }
        }

        return maxSquareSize;
    }
}
