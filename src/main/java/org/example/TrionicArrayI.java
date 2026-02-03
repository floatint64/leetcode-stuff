package org.example;

public class TrionicArrayI {
    public boolean isTrionic(int[] nums) {
        int cnt = 0;
        int i = 1;
        int iN = i;
        while (iN < nums.length && nums[iN - 1] < nums[iN]) {
            iN++;
            cnt++;
        }

        if (cnt < 1) {
            return false;
        }

        cnt = 0;
        int p = iN;
        int pN = p;

        while (pN < nums.length && nums[pN - 1] > nums[pN]) {
            pN++;
            cnt++;
        }

        if (cnt < 1) {
            return false;
        }

        cnt = 0;

        int q = pN;
        int qN = q;

        while (qN < nums.length && nums[qN - 1] < nums[qN]) {
            qN++;
            cnt++;
        }

        if (qN >= nums.length) {
            if (nums[qN - 2] < nums[qN - 1]) {
                cnt++;
            }
        }

        return cnt > 0 && qN == nums.length;
    }
}
