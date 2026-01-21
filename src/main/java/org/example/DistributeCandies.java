package org.example;

import java.util.HashSet;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        var map = new HashSet<Integer>(candyType.length);

        int max = candyType.length / 2;
        for (int i = 0; i < candyType.length; i++) {
            map.add(candyType[i]);
            if (max == map.size()) {
                return max;
            }
        }

        return map.size();
    }
}
