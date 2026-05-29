package org.example;

public class MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int v : nums) {
            int sum = 0;
            while (v > 0) {
                sum += v % 10;
                v /= 10;
            }
            min = Math.min(sum, min);
        }

        return min;
    }
}
