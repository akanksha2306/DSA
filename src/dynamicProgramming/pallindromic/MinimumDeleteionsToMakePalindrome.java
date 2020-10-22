package dynamicProgramming.pallindromic;

import dynamicProgramming.longestCoSubsequenceTopDown;

public class MinimumDeleteionsToMakePalindrome {
//min number of deletions to make it a pallindrome = min number of insertions to make it a pallindrome
    static int minDeletionsToMakePallindrome(String X){
        int n = X.length();

        //reversing the string with stringbuilder.
        StringBuilder sb = new StringBuilder(X);
        String reverseX = sb.reverse().toString();

        //LPS =n - LCS()
        return  n - longestCoSubsequenceTopDown.topDown(X, reverseX);

    }
    public static void main(String[] args) {
        String x = "aebcbda";
        System.out.println(minDeletionsToMakePallindrome(x));
    }

}
