package org.example;

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> cache = new HashMap<>();
        cache.put(0, -1);

        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            if (!cache.containsKey(sum)) {
                cache.put(sum, i);
            } else {
                result = Math.max(result, i - cache.get(sum));
            }
        }

        return result;
    }
}
