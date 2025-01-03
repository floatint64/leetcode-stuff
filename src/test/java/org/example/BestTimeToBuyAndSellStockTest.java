package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {

        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] prices = new int[] {7,1,5,3,6,4};
        Assertions.assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void maxProfit2() {

        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] prices = new int[] {7,6,4,3,1};
        Assertions.assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void maxProfit3() {

        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] prices = new int[] {2,4,1};
        Assertions.assertEquals(2, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void maxProfit4() {

        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] prices = new int[] {3,2,6,5,0,3};
        Assertions.assertEquals(4, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void maxProfit5() {

        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] prices = new int[] {1,2};
        Assertions.assertEquals(1, bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}