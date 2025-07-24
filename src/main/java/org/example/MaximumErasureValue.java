package org.example;


public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {

        int l = 0;
        int r = 0;
        int max = 0;

        boolean[] numVisited = new boolean[10001];

        int curr = 0;
        while (r < nums.length) {

            while (numVisited[nums[r]]) {
                numVisited[nums[l]] = false;
                curr -= nums[l];
                l++;
            }

            curr += nums[r];
            numVisited[nums[r]] = true;
            max = Math.max(max, curr);
            r++;
        }

        return max;
    }
}
