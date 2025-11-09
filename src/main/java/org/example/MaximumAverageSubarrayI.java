package org.example;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {

        int windowValue = 0;

        int l = 0;
        int r = k;

        for (int i = 0; i < k; i++) {
            windowValue += nums[i];
        }

        int maxValue = windowValue;

        while (r < nums.length) {
            windowValue += nums[r++];
            windowValue -= nums[l++];
            maxValue = Math.max(maxValue, windowValue);
        }

        return (double) maxValue / k;
    }
}
