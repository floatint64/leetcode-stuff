package org.example;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {
    public int numOfPairs(String[] nums, String target) {

        Map<String, Integer> numCache = new HashMap<>(target.length());
        int[] counter = {0};

        for (int i = 0; i < nums.length; i++) {
            int finalI = i;
            numCache.entrySet()
                    .forEach(v -> {
                        if (target.equals(v.getKey() + nums[finalI])) {
                            counter[0] += v.getValue();
                        }
                        if (target.equals(nums[finalI] + v.getKey())) {
                            counter[0] += v.getValue();
                        }
                    });
            numCache.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
        }

        return counter[0];
    }
}
