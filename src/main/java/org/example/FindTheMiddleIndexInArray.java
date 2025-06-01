package org.example;

public class FindTheMiddleIndexInArray {
    public int findMiddleIndex(int[] nums) {
        int[] forwardPrefix = new int[nums.length];
        int[] backwardPrefix = new int[nums.length];

        forwardPrefix[0] = nums[0];
        backwardPrefix[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            forwardPrefix[i] = forwardPrefix[i - 1] + nums[i];
            backwardPrefix[nums.length - i - 1] = backwardPrefix[nums.length - i] + nums[nums.length - i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (forwardPrefix[i] == backwardPrefix[i]) {
                return i;
            }
        }

        return -1;
    }
}
