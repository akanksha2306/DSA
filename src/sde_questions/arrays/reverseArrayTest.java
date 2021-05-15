package sde_questions.arrays;

import org.junit.Test;

import java.util.Arrays;

public class reverseArrayTest {

    @Test
    public void testReverseArray() {
        int[] a = new int[]{5,6,7,89,90};
        int[] arrayReversed = reverseArray.solution(a, 0,a.length-1);
        System.out.println(Arrays.toString(arrayReversed));
    }


}