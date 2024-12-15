package org.example;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        var max_sum = Integer.MIN_VALUE;
        var current_sum = 0;
        for (var v : nums) {
            current_sum = Math.max(v, current_sum + v);
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }
}
