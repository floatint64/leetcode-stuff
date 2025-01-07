package org.example;

public class SearchInsertPosition {
    private int searchIndexSub(int[] nums, int target, int l, int r) {

        if (l > r) {
            return l;
        }

        if (l == r) {
            return target > nums[l] ? l + 1 : l;
        }

        int m = l + (r - l) / 2;
        if (nums[m] == target) {
            return m;
        }

        if (target < nums[m]) {
            return searchIndexSub(nums, target, l, m - 1);
        } else {
            return searchIndexSub(nums, target, m + 1, r);
        }
    }

    public int searchInsert(int[] nums, int target) {
        return searchIndexSub(nums, target, 0, nums.length - 1);
    }
}
