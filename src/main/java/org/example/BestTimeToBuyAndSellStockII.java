package org.example;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;

        int l = 0;
        int r = l + 1;

        while (l < r && r < prices.length) {
            int localProfit = Math.max(prices[r] - prices[l], 0);
            l = r;
            r++;
            profit += localProfit;
        }

        return profit;
    }
}
