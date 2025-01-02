package org.example;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        boolean[] mask = new boolean[nums.length + 1];

        for (int n : nums) {
            mask[n] = true;
        }

        for (int i = 0; i < mask.length; i++) {
            if (!mask[i]) {
                return i;
            }
        }

        return 0;
    }
}
