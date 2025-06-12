package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] expeted = {1,2,2,3,5,6};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge2() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] expeted = {1};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge3() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        int[] expeted = {1};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge4() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {4,4,4,0,0,0};
        int m = 3;
        int[] nums2 = {1,1,1};
        int n = 3;

        int[] expeted = {1,1,1,4,4,4};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge5() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {0,0,0,0,0,0};
        int m = 3;
        int[] nums2 = {1,1,1};
        int n = 3;

        int[] expeted = {0,0,0,1,1,1};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge6() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {0,0,0,0,0,0};
        int m = 0;
        int[] nums2 = {1,1,1};
        int n = 0;

        int[] expeted = {0,0,0,0,0,0};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge7() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {4,0,0,0,0,0};
        int m = 1;
        int[] nums2 = {1,2,3,5,6};
        int n = 5;

        int[] expeted = {1,2,3,4,5,6};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge8() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {1,2,4,5,6,0};
        int m = 5;
        int[] nums2 = {3};
        int n = 1;

        int[] expeted = {1,2,3,4,5,6};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }

    @Test
    void merge9() {

        MergeSortedArray merge = new MergeSortedArray();

        int[] nums1 = {1,2,4,0,0,0};
        int m = 3;
        int[] nums2 = {1,1,8};
        int n = 3;

        int[] expeted = {1,1,1,2,4,8};

        merge.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expeted, nums1);
    }
}