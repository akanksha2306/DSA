package dynamicProgramming.subStrings;

public class MinimumDeletionsToMakeLPSu  {

    static int minimumDeletion(String x){

        int n = x.length();

        StringBuilder y1 = new StringBuilder();
        y1.append(x);

        y1 = y1.reverse();
        int m = y1.length();
        //string ki length minus longestCOmmonSubsequence
        int minDeletion = n-longestCoSubsequenceTopDown.topDown(x, y1.toString());
        System.out.println(minDeletion);
        return minDeletion;

    }

    public static void main(String[] args) {
        String x = "abgccba";
        System.out.println(MinimumDeletionsToMakeLPSu.minimumDeletion(x));
    }



}
