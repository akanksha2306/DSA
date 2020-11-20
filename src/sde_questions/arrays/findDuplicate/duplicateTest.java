package sde_questions.arrays.findDuplicate;

import org.junit.Assert;
import org.junit.Test;

import static sde_questions.arrays.findDuplicate.duplicate.findDuplicate;

public class duplicateTest {

    @Test
    public void findDuplicates() {

        int[] arr = new int[]{1, 2, 3, 1};
        int[] arr1 = new int[]{2,2,2,2,2};

        int ans = findDuplicate(arr1);

        Assert.assertEquals(2, ans);

    }
}