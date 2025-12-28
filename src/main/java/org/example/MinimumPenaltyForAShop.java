package org.example;

public class MinimumPenaltyForAShop {
    public int bestClosingTime(String customers) {
        int maxPenalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                maxPenalty++;
            }
        }

        int availableCustomers = maxPenalty;
        int noCustomers = 0;
        int minPenalty = maxPenalty;
        int minPenaltyPos = 0;
        for (int i = 0; i <= customers.length(); i++) {
            if (availableCustomers + noCustomers < minPenalty) {
                minPenalty = availableCustomers + noCustomers;
                minPenaltyPos = i;
            }
            if (i < customers.length() && customers.charAt(i) == 'Y') {
                availableCustomers--;
            } else {
                noCustomers++;
            }
        }

        return minPenaltyPos;
    }
}
