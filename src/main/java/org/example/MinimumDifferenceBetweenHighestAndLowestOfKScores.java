package org.example;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public int minimumDifference(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);

        int l = 0;
        int r = k - 1;
        int minDiff = Integer.MAX_VALUE;

        while (r < nums.length) {
            minDiff = Math.min(minDiff, nums[r] - nums[l]);
            l++;
            r++;
        }

        return minDiff;
    }
}
