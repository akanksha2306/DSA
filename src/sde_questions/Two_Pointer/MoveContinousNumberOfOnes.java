package sde_questions.Two_Pointer;

public class MoveContinousNumberOfOnes {
    static int countZeroes(int[] A) {

        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < A.length; i++) {
            //as soon a we find 1, increment the counter to 1;
            if (A[i] == 1) {
                counter++;
            }else{
                counter = 0;
            }
            maxCounter = Math.max(maxCounter, counter);
        }
        return maxCounter;
    }
    //time complexity = o(n);
    //space complexity = 1;

    public static void main(String[] args) {
        int[] A = new int[]{1,1,0,1,1,1,1,1,9};
        int ans = countZeroes(A);
        System.out.println(ans);
    }

}
