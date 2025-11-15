package org.example;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int r = nums.length - 1;

        int[] max = new int[] {0, 0, nums[r--]};

        int cnt = 1;

        while (r >= 0 && cnt < 3) {
            if (nums[r] != nums[r + 1]) {
                max[max.length - cnt - 1] = nums[r];
                cnt++;
            }
            r--;
        }

        if (cnt < 3) {
            return max[max.length - 1];
        } else {
            return max[0];
        }
    }
}
