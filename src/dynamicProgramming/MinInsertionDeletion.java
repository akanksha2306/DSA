package dynamicProgramming;

public class MinInsertionDeletion {

    static void minInsertionDeletionForAtoB(String x, String y){

        int n = x.length();//heap
        int m = y.length();//pea

        int minimumInsertions= m-longestCoSubsequenceTopDown.topDown(x,y);
        int minimumDeletions = n -longestCoSubsequenceTopDown.topDown(x,y);
        System.out.println("minimumDeletions"+ " "+ minimumDeletions);
        System.out.println("minimumInsertions"+" "+minimumInsertions);

    }

    public static void main(String[] args) {
        String x = "heap";
        String y = "pea";

        minInsertionDeletionForAtoB(x,y);
    }
}
