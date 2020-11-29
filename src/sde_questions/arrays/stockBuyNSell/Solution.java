package sde_questions.arrays.stockBuyNSell;

public class Solution {
//7,1,5,4,6
    public static int maxProfit(int[] prices) {

        int minNumber = Integer.MAX_VALUE;
        int profit = 0;
        for(int i= 0; i<prices.length; i++){

            //here we are storing the minimum number and comparing it with every i element of the current ith itertion
            //uss min number k saath-ith number i will substract and calculate profit.

             minNumber = Math.min(prices[i],minNumber);
            profit = Math.max(profit,prices[i]-minNumber);
        }
        return profit;
    }
}
