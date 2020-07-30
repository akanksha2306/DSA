package leetCode.DataStructure.buyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int minBuyingPrice = Integer.MAX_VALUE;
        int profit= 0;
        for (int i = 0; i < prices.length ; i++) {

            profit = Math.max(profit,prices[i]-minBuyingPrice);
            minBuyingPrice = Math.min(prices[i],minBuyingPrice);

        }
        return profit;
    }
    public static void main(String[] args) {

        int result = new leetCode.DataStructure.buyAndSellStock.Solution().maxProfit(new int[]{7, 9 ,10, 11 ,12});
        // System.out.print(result);
        System.out.print((result));
    }
}
