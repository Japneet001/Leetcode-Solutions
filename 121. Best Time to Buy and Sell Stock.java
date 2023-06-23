/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            int sellprice = prices[i];
            if (buyprice < sellprice) {
                int profit = sellprice - buyprice;
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            } else {
                buyprice = sellprice;
            }
        }
        return maxprofit;
    }
}