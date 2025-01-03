package org.example;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int currMax = 0;

        int l = 0;
        int r = l + 1;

        while (l < r && r < prices.length) {
            if (prices[r] < prices[l]) {
                l++;
                r = l + 1;
            } else {
                currMax = Math.max(currMax, prices[r] - prices[l]);
                r++;
            }
        }

        return currMax;
    }
}
