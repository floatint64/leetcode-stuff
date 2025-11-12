package org.example;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] major;
        int[] minor;

        if (nums1.length > nums2.length) {
            major = nums1;
            minor = nums2;
        } else {
            major = nums2;
            minor = nums1;
        }

        int[] result = new int[minor.length];
        int cnt = 0;

        Arrays.sort(major);
        Arrays.sort(minor);

        int l = 0;
        int r = 0;

        while (l < minor.length && r < major.length) {
            if (minor[l] == major[r]) {
                result[cnt++] = minor[l];
                l++;
                r++;
            } else if (major[r] < minor[l]){
                r++;
            } else {
                l++;
            }
        }

        return Arrays.copyOf(result, cnt);
    }
}
