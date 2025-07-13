package org.example;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int max = Integer.MIN_VALUE;

        int last = Integer.MIN_VALUE;

        int i = 0;
        int cnt = 0;
        while (i < nums.length) {
            if (nums[i] > last) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
            last = nums[i];
            i++;
        }

        max = Math.max(max, cnt);

        return max;
    }
}
