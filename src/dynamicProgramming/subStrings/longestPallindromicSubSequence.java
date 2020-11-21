package dynamicProgramming.subStrings;

public class longestPallindromicSubSequence {

    static int lps(String x) {

        int n = x.length();


        StringBuilder y1 = new StringBuilder();

        // append a string into StringBuilder input1
        y1.append(x);

        // reverse StringBuilder input1
        y1 = y1.reverse();
        int m = y1.length();
        int ans = longestCoSubsequenceTopDown.topDown(x, y1.toString());
        return ans;
    }

    public static void main(String[] args) {
        String x = "abgccba";
        System.out.println(longestPallindromicSubSequence.lps(x));
    }
}


