package org.example;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastInsertPos = nums1.length - 1;

        int i = m - 1;
        int j = n - 1;

        while (j >= 0) {
            if (i < 0 || nums1[i] < nums2[j]) {
                nums1[lastInsertPos--] = nums2[j];
                j--;
            } else {
                if (nums1[i] >= nums2[j]) {
                    nums1[lastInsertPos--] = nums1[i];
                    nums1[i] = nums2[j];
                    i--;
                }
            }
        }
    }
}
