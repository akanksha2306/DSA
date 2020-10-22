package dynamicProgramming.subsetProblems;

import java.util.Arrays;

public class CountOfSubsetSumWithDifference {

    //same as Target Sum question

    public int subSetSumWithADifference(int[] arr, int difference) {

        //means Subset1- Subset2 = difference;

        //int S1 -S2 = difference;


        int S1 = (difference + Arrays.stream(arr).sum()) / 2;

        CountOfSubsetSum cs = new CountOfSubsetSum();

        int answer = cs.count(arr, S1);
        System.out.println(answer);
        return answer;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 1};
        int diff = 3;

        CountOfSubsetSumWithDifference c = new CountOfSubsetSumWithDifference();
        c.subSetSumWithADifference(arr,diff);


    }


}
