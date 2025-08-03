package org.example;

import java.util.Arrays;

public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i+=2) {
            int tmp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = tmp;
        }

        return nums;
    }
}
