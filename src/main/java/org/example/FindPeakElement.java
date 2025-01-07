package org.example;

public class FindPeakElement {
    private int findPeakElementSub(int[] nums, int l, int r) {

        if (l > r) {
            return -1;
        }

        if (l == r && nums.length == 1) {
            return l;
        }

        l = Math.max(l, 0);
        r = r >= nums.length ? nums.length - 1 : r;

        int m = l + (r - l) / 2;

        int lt = m - 1;
        int rt = m + 1;

        int lv = Integer.MIN_VALUE;
        int rv = Integer.MIN_VALUE;

        if (lt >= 0) {
            lv = nums[lt];
        }

        if (rt < nums.length) {
            rv = nums[rt];
        }

        int mv = nums[m];

        if (lv < mv && mv > rv) {
            return m;
        } else {
            int lr = findPeakElementSub(nums, l, m - 1);
            return lr == -1 ? findPeakElementSub(nums, m + 1, r) : lr;
        }
    }

    public int findPeakElement(int[] nums) {
        return findPeakElementSub(nums, 0, nums.length - 1);
    }
}
