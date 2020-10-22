package dynamicProgramming.subStrings;

public class lcsRecursive {

    static int  lcs(String x, String y, int n, int m){

       //base case

        if(n ==0 || m ==0){
            return 0;
        }

        if(x.charAt(n-1)==y.charAt(m-1)){
            return 1+lcs(x,y,n-1,m-1);
        }

        else{

            return  Math.max(lcs(x,y,n-1,m),lcs(x,y,n,m-1));
        }

    }

    public static void main(String[] args) {
        String x = "AGGTAB";
        String y = "GXTXAYB";
       // System.out.println(lcs(x,y,6,6));


    }

}
