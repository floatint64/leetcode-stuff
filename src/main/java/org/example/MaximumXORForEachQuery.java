package org.example;

public class MaximumXORForEachQuery {

    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        int[] result = new int[nums.length];
        int maxK = ((int)Math.pow(2, maximumBit)) - 1;

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] ^ nums[i];
            result[nums.length - i] = Math.abs(prefix[i - 1] - maxK);
        }

        result[0] = Math.abs(prefix[nums.length - 1] - maxK);

        return result;
    }
}
