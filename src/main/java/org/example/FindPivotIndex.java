package org.example;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] lPrefix = new int[nums.length];
        int[] rPrefix = new int[nums.length];

        lPrefix[0] = nums[0];
        rPrefix[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            lPrefix[i] = lPrefix[i - 1] + nums[i];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rPrefix[i] = rPrefix[i + 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (lPrefix[i] == rPrefix[i]) {
                return i;
            }
        }

        return -1;
    }
}
