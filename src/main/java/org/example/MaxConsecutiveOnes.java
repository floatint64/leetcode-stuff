package org.example;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;

        int i = 0;
        int cnt = 0;
        while (i < nums.length) {
            if (nums[i] == 0 && cnt > 0) {
                max = Math.max(max, cnt);
                cnt = 0;
                continue;
            }
            cnt += nums[i++];
        }

        max = Math.max(max, cnt);

        return max;
    }
}
