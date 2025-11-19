package org.example;

import java.util.HashSet;

public class KeepMultiplyingFoundValuesByTwo {
    public int findFinalValue(int[] nums, int original) {
        var hash = new HashSet<Integer>();

        for (var i : nums) {
            hash.add(i);
        }

        while (hash.contains(original)) {
            original *= 2;
        }

        return original;
    }
}
