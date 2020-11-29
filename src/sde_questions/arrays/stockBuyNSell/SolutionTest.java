package sde_questions.arrays.stockBuyNSell;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit() {
        int[] arr = new int[]{7,1,5,2,3,6};

       int profit =  Solution.maxProfit(arr);
       System.out.println(profit);
    }
}