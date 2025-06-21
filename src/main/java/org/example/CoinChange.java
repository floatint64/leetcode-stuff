package org.example;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }

        Arrays.sort(coins);

        int[] coinsAmount = new int[coins.length];
        int[] amountMod = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            coinsAmount[i] = amount / coins[i];
            amountMod[i] = amount % coins[i];
        }

        int coinsCount = 0;


        for (int i = coinsAmount.length - 1; i >= 0; i--) {
            for (int j = 0; j < coinsAmount[i]; j++) {
                amount -= coins[i];
                if (amount >= 0) {
                    coinsCount++;
                } else {
                    amount += coins[i];
                    break;
                }
            }
        }

        return amount == 0 ? coinsCount : -1;
    }
}
