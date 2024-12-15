package org.example;

import java.util.TreeMap;

public class ClimbingStairs {

    private final TreeMap<Integer, Integer> TREE_MAP = new TreeMap<>();
    public ClimbingStairs() {
        TREE_MAP.put(0, 1);
        TREE_MAP.put(1, 1);
    }

    public int climbStairs(int n) {
        var cached = TREE_MAP.get(n);
        if (cached != null) {
            return cached;
        }

        var newValue = climbStairs(n - 1) + climbStairs(n - 2);
        TREE_MAP.put(n, newValue);

        return newValue;
    }
}
