package org.example;

import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> cache = new TreeSet<>();

        for (var n : nums) {
            if (!cache.contains(n)) {
                cache.add(n);
            } else {
                return true;
            }
        }

        return false;
    }
}
