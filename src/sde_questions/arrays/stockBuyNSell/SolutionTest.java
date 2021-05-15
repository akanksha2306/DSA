package sde_questions.arrays.stockBuyNSell;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxProfit() {
        int[] arr = new int[]{6,0,-1,10};

       int profit =  Solution.maxProfit(arr);
       System.out.println(profit);
    }
}