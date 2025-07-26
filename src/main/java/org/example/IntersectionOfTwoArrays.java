package org.example;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[Math.max(nums1.length, nums2.length)];

        int[] major;
        int[] minor;
        if (nums1.length > nums2.length) {
            major = nums1;
            minor = nums2;
        } else {
            major = nums2;
            minor = nums1;
        }

        boolean[] presentedMajor = new boolean[1001];
        boolean[] presentedMinor = new boolean[1001];

        for (int i = 0; i < major.length; i++) {
            presentedMajor[major[i]] = true;
        }

        int resultPos = 0;

        for (int i = 0; i < minor.length; i++) {
            if (presentedMajor[minor[i]] && !presentedMinor[minor[i]]) {
                presentedMinor[minor[i]] = true;
                result[resultPos++] = minor[i];
            }
        }

        return Arrays.copyOfRange(result, 0, resultPos);
    }
}
