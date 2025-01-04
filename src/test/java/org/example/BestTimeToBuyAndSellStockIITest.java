package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIITest {

    @Test
    void maxProfit() {

        BestTimeToBuyAndSellStockII sell = new BestTimeToBuyAndSellStockII();

        int[] prices = new int[] {7,1,5,3,6,4};

        Assertions.assertEquals(7, sell.maxProfit(prices));
    }

    @Test
    void maxProfit2() {

        BestTimeToBuyAndSellStockII sell = new BestTimeToBuyAndSellStockII();

        int[] prices = new int[] {1,2,3,4,5};

        Assertions.assertEquals(4, sell.maxProfit(prices));
    }

    @Test
    void maxProfit3() {

        BestTimeToBuyAndSellStockII sell = new BestTimeToBuyAndSellStockII();

        int[] prices = new int[] {7,6,4,3,1};

        Assertions.assertEquals(0, sell.maxProfit(prices));
    }

    @Test
    void maxProfit4() {

        BestTimeToBuyAndSellStockII sell = new BestTimeToBuyAndSellStockII();

        int[] prices = new int[] {3,3,5,0,0,3,1,4};

        Assertions.assertEquals(8, sell.maxProfit(prices));
    }

    @Test
    void maxProfit5() {

        BestTimeToBuyAndSellStockII sell = new BestTimeToBuyAndSellStockII();

        int[] prices = new int[] {2,1};

        Assertions.assertEquals(0, sell.maxProfit(prices));
    }
}