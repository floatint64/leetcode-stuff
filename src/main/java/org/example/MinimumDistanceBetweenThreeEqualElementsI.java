package org.example;

public class MinimumDistanceBetweenThreeEqualElementsI {
    public int minimumDistance(int[] nums) {
        int[][] freq = new int[101][101];
        int[] pos = new int[101];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]][pos[nums[i]]++] = i;
        }

        int min = Integer.MAX_VALUE;

        boolean noTuples = true;
        for (var n : nums) {
            if (pos[n] >= 3) {
                for (int i = 0; i < pos[n] - 1; i++) {
                    min = Math.min(min,
                            Math.abs(freq[n][i] - freq[n][i + 1]) +
                                    Math.abs(freq[n][i + 1] - freq[n][i + 2]) +
                                    Math.abs(freq[n][i + 2] - freq[n][i])
                    );
                }
                noTuples = false;
            }
        }

        return noTuples ? -1 : min;
    }
}
