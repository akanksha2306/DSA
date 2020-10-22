package dynamicProgramming.subsetProblems;

import java.util.Arrays;

public class CountOfSubsetSumWithDifference {

    //same as Target Sum question

    public int subSetSumWithADifference(int[] arr, int difference) {

        //means Subset1- Subset2 = difference;

        //int S1 -S2 = difference;

        //if i take out count of subsets with a given sum say  4 ,for instance then i can
        //then Count[sum(s1)] =4, obviosuly other will be 3 and will amount to diff =1
        //means i have to take out count of subset for sum S1 = 4..it boils down to same problem as countOfSubsetSum

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
