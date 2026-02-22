package org.example;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        for (var n : nums) {
            var oldVal = m.get(n);
            var val = oldVal == null ? 1 : oldVal + 1;
            m.put(n, val);
        }


        int[] numsPos = {0};

        m.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    var valueCmp = e1.getValue().compareTo(e2.getValue());
                    if (valueCmp == 0) {
                        return e2.getKey().compareTo(e1.getKey());
                    }

                    return valueCmp;
                })
                .forEach(e -> {
                    for (int i = 0; i < e.getValue(); i++) {
                        nums[numsPos[0]++] = e.getKey();
                    }
                });

        return nums;
    }
}
