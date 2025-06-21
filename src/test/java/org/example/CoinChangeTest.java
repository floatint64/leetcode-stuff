package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void coinChange() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {1,2,5};
        int amount = 11;

        Assertions.assertEquals(3, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange2() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {2};
        int amount = 3;

        Assertions.assertEquals(-1, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange3() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {1};
        int amount = 0;

        Assertions.assertEquals(0, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange4() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {1,8};
        int amount = 7;

        Assertions.assertEquals(7, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange5() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {1};
        int amount = 1;

        Assertions.assertEquals(1, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange6() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {1,3,4};
        int amount = 12;

        Assertions.assertEquals(3, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange7() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {6,12};
        int amount = 12;

        Assertions.assertEquals(1, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange8() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {5, 7};
        int amount = 1;

        Assertions.assertEquals(-1, coinsChange.coinChange(coins, amount));
    }

    @Test
    void coinChange9() {
        CoinChange coinsChange = new CoinChange();

        int[] coins = {186,419,83,408};
        int amount = 6249;

        Assertions.assertEquals(20, coinsChange.coinChange(coins, amount));
    }
}