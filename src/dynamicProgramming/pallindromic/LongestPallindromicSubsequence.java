package dynamicProgramming.pallindromic;

import dynamicProgramming.subStrings.longestCoSubsequenceTopDown;

public class LongestPallindromicSubsequence {
    /*****
     *
     * @param X- this will be a String

     *   now For LPS- we should find LCS of these two strings and will substract that from length of string x.
     * @return
     */

    static int lps(String X) {

        int n = X.length();

        //reversing the string with stringbuilder.
        StringBuilder sb = new StringBuilder(X);
        String reverseX = sb.reverse().toString();

        //LPS =n - LCS()
        return  longestCoSubsequenceTopDown.topDown(X, reverseX);

    }

    public static void main(String[] args) {
        String x = "agbcbajk";
        System.out.println(lps(x));
    }

}



