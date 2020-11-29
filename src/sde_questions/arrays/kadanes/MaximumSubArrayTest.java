package sde_questions.arrays.kadanes;

import Algorithms.slidingWindow.minNumberFromSubArray;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubArrayTest {

    @Test
    public void maxNum() {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1,-5,4};
        int maxOfMins = MaximumSubArray.maxNum(a);
        System.out.println(maxOfMins);
    }
}