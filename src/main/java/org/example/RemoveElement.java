package org.example;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;

        int valEqualsCount = 0;

        while (l <= r) {

            if (nums[r] == val) {
                r--;
                valEqualsCount++;
                continue;
            }

            if (nums[l] == val) {
                var tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                r--;
                valEqualsCount++;
            }

            l++;
        }

        return nums.length - valEqualsCount;
    }
}
