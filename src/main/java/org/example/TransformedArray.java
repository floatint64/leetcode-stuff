package org.example;

public class TransformedArray {
    public int[] constructTransformedArray(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 0) {
                result[i] = 0;
            } else {
                result[i] = nums[calcIdx(i + num, nums.length)];
            }
        }

        return result;
    }

    private static int calcIdx(int index, int size) {
        int result = index % size;
        if (result < 0) {
            result += size;
        }
        return result;
    }
}
