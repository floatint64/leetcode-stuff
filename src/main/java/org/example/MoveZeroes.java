package org.example;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 1;

        while (r < nums.length) {
            var lv = nums[l];
            var rv = nums[r];
            if (lv == 0 && rv == 0) {
                ++r;
                continue;
            } else if (lv == 0){
                nums[r] = lv;
                nums[l] = rv;
            }
            l++;
            r = l + 1;
        }
    }
}
