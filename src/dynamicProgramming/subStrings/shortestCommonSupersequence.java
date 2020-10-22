package dynamicProgramming.subStrings;


import dynamicProgramming.subStrings.longestCoSubsequenceTopDown;

public class shortestCommonSupersequence {
//https://www.geeksforgeeks.org/shortest-common-supersequence/
    public static int superSubsequence(String x, String y){

        int m = x.length();
        int n = y.length();

        return m+n- longestCoSubsequenceTopDown.topDown(x,y,m,n);

    }

    public static void main(String[] args) {
        String x = "AGGTAB";
        String y = "GXTXAYB";
        int ans = superSubsequence(x,y);
        System.out.println(ans);

    }
}
