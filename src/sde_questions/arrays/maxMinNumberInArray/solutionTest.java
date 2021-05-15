package sde_questions.arrays.maxMinNumberInArray;

import org.junit.jupiter.api.Test;
import sde_questions.arrays.reverseArray;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class solutionTest {

    @org.junit.Test
    public void minMax() {

        int[] a = new int[]{5,6,7,89,-90};
        int ans  = solution.minMax(a);
        System.out.println(ans);
    }
}