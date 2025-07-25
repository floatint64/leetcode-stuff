package org.example;

public class MaximumUniqueSubarraySumAfterDeletion {
    public int maxSum(int[] nums) {
        boolean[] visited = new boolean[101];
        int sum = 0;

        int negativeMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                if (!visited[nums[i]]) {
                    sum += nums[i];
                    visited[nums[i]] = true;
                }
            } else {
                negativeMax = Math.max(negativeMax, nums[i]);
            }
        }

        return negativeMax > Integer.MIN_VALUE && !visited[0] && sum == 0 ? negativeMax : sum;
    }
}
