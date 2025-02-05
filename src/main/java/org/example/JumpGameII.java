package org.example;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0;

        int l = 0;

        while (l < nums.length - 1) {
            int nextJumpMaxCnt = nums[l];
            int nextJumpIdx = l + nextJumpMaxCnt;
            if (l + nextJumpMaxCnt >= nums.length - 1) {
                jumps++;
                break;
            }
            for (int j = l + 1; j < l + nums[l] + 1 && j < nums.length; j++) {
                if (nums[j] > nextJumpMaxCnt) {
                    nextJumpMaxCnt = nums[j];
                    nextJumpIdx = j;
                } else if (nums[j] == nextJumpMaxCnt) {
                    nextJumpIdx = j;
                }
            }
            l = nextJumpIdx;
            jumps++;
        }

        return jumps;
    }
}
