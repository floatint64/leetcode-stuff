package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysIITest {

    @Test
    void intersect() {
        IntersectionOfTwoArraysII inter = new IntersectionOfTwoArraysII();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expected = {2,2};

        Assertions.assertArrayEquals(expected, inter.intersect(nums1, nums2));
    }

    @Test
    void intersect2() {
        IntersectionOfTwoArraysII inter = new IntersectionOfTwoArraysII();

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] expected = {4,9};

        Assertions.assertArrayEquals(expected, inter.intersect(nums1, nums2));
    }

    @Test
    void intersect3() {
        IntersectionOfTwoArraysII inter = new IntersectionOfTwoArraysII();

        int[] nums1 = {1,1,1};
        int[] nums2 = {1};
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, inter.intersect(nums1, nums2));
    }

    @Test
    void intersect4() {
        IntersectionOfTwoArraysII inter = new IntersectionOfTwoArraysII();

        int[] nums1 = {1,1,1,2};
        int[] nums2 = {1,1,2};
        int[] expected = {1,1,2};

        Assertions.assertArrayEquals(expected, inter.intersect(nums1, nums2));
    }
}