package org.example;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        long[] cache = new long[amount + 1];
        Arrays.fill(cache, Integer.MAX_VALUE);
        cache[0] = 0;

        for (int a = 1; a < cache.length; a++) {
            for (int coin : coins) {
                if (a >= coin) {
                    cache[a] = Math.min(cache[a], cache[a - coin] + 1);
                }
            }
        }

        return (int)(cache[amount] == Integer.MAX_VALUE ? -1 : cache[amount]);
    }
}
