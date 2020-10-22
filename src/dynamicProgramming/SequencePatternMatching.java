package dynamicProgramming;

public class SequencePatternMatching {

    public static boolean isSubsequence(String s, String t) {


        int lengthOfLcs  =  LCS(s, t);

        if(lengthOfLcs == s.length()){
            return true;
        }
        else
            return false;
    }


    public static int LCS(String s, String t) {

        //take out the lcs for this
        int n = s.length();
        int m = t.length();

        int[][]T  = new int[n+1][m+1];



        for(int i =0; i <n+1; i++){

            T[n][0] = 0;

        }
        for(int j =0; j <m+1; j++){
            T[0][m]= 0;
        }


        for(int i=1;i<n+1; i++){
            for(int j=1; j<m+1; j++){

                if(s.charAt(i-1) == t.charAt(j-1)){
                    T[i][j] = 1+T[i-1][j-1];
                }else{
                    T[i][j] = Math.max(T[i][j-1],T[i-1][j]);
                }
            }
        }
        return T[n][m];


    }

    public static void main(String[] args) {
        String s = "abc";
        String m = "ahbgdc";
        System.out.println(isSubsequence(s,m));
    }


}
