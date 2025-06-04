package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindGoodDaysToRobTheBank {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        var result = new ArrayList<Integer>(security.length);

        int[] nonIncreasing = new int[security.length];
        int[] nonDecreasing = new int[security.length];

        for (int i = 1; i < security.length; i++) {
            if (security[i] <= security[i - 1]) {
                nonIncreasing[i] = nonIncreasing[i - 1] + 1;
            }

            if (security[security.length - i] >= security[security.length - i - 1]) {
                nonDecreasing[security.length - i - 1] = nonDecreasing[security.length - i] + 1;
            }
        }

        for (int i = 0; i < security.length; i++) {
            if (nonIncreasing[i] >= time && nonDecreasing[i] >= time) {
                result.add(i);
            }
        }

        return result;
    }
}
