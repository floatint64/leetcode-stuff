package org.example;

import java.util.Arrays;

public class PartitionArraySuchThatMaximumDifferenceIsK {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int result = 0;
        int i = 0;
        int j = i + 1;

        while (i < nums.length) {
            if (j < nums.length) {
                if (nums[j] - nums[i] <= k) {
                    j++;
                } else {
                    i = j;
                    j = i + 1;
                    result++;
                }
            } else {
                if (nums[j - 1] - nums[i] <= k) {
                    result++;
                    i = j;
                    j = i + 1;
                }
            }
        }

        return result;
    }
}
