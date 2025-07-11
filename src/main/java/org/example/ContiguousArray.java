package org.example;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {

        int[] z = new int[nums.length + 1];
        int[] f = new int[nums.length + 1];
        int[] diff = new int[nums.length + 1];
        int currDiffMax = 0;
        for (int i = 1; i < z.length; i++) {
            if (nums[i - 1] == 1) {
                z[i] += z[i - 1] + 1;
                f[i] = 0;
            } else {
                z[i] = 0;
                f[i] += f[i - 1] + 1;
            }
            int d = Math.abs(z[i] - f[i]);
            if (diff[d] >0) {
                int maxI = Math.max(i, diff[d]);
                int minI = Math.min(i, diff[d]);
                int max = maxI - minI + d;
                currDiffMax = Math.max(currDiffMax, max/*i - diff[d]*/);
            }
            diff[d] = i;
        }

        return currDiffMax;

//        int i = 1;
//        int j = f.length - 1;
//
//        int skipCnt = 0;
//        while (i < j) {
//            if (f[i] == z[j]) {
//                return j - i + skipCnt;
//            }
//
//            skipCnt++;
//            if (z[j] > f[i]) {
//                if (i + 1 < f.length && f[i + 1] != 0) {
//                    i++;
//                } else {
//                    j--;
//                }
//            } else {
//                if (j - 1 >= 0 && z[j - 1] != 0) {
//                    j--;
//                } else {
//                    i++;
//                }
//            }
//
//        }

        //return 0;

//        int maxVal = 0;
//
//        int i = 0;
//
//        int[] counts = {0, 0};
//
//        while (i < nums.length) {
//            int currNum = nums[i];
//            do {
//                counts[currNum]++;
//                i++;
//            } while (i < nums.length && nums[i] == currNum);
//
//            if (i < nums.length) {
//                currNum = nums[i];
//                do {
//                    counts[currNum]++;
//                    i++;
//                } while (i < nums.length && nums[i] == currNum);
//            }
//
//            maxVal = Math.max(maxVal, 2 * Math.min(counts[0], counts[1]));
//            if (counts[0] > counts[1]) {
//                counts[1] = 0;
//            } else {
//                counts[0] = 0;
//            }
//        }
//
//        return maxVal;
    }
}
