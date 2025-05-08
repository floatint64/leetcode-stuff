package org.example;

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int[] counts = {0, 0, 0};

        for (int num : nums) {
            counts[num]++;
        }

        for (int i = 0; i < counts[0]; i++) {
            nums[i] = 0;
        }
        for (int i = counts[0]; i < counts[0] + counts[1]; i++) {
            nums[i] = 1;
        }
        for (int i = counts[0] + counts[1]; i < counts[0] + counts[1] + counts[2]; i++) {
            nums[i] = 2;
        }
    }
}
