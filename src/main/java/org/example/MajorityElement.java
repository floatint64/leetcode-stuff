package org.example;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;

        int currentN = 0;
        int lastChar = Integer.MIN_VALUE;

        int i = 0;
        while (currentN <= n && i < nums.length) {
            var newLastChar = nums[i];
            if (lastChar != newLastChar) {
                if (currentN > n) {
                    break;
                }
                currentN = 1;
            } else {
                currentN++;
            }
            lastChar = newLastChar;
            i++;
        }

        return lastChar;
    }
}
