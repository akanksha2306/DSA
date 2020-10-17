package Algorithms.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class minNumberFromSubArrayTest {

    @Test
    public void maxOfMins() {
        int[] a = new int[]{2, 1, 5, 3, 7, 4};
        int maxOfMins = minNumberFromSubArray.maxOfMins(a, 3);
        Assert.assertEquals(3, maxOfMins);
    }
}