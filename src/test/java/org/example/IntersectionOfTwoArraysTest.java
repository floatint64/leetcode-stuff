package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    @Test
    void intersection() {
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expected = {2};

        Assertions.assertArrayEquals(expected, intersection.intersection(nums1, nums2));
    }

    @Test
    void intersection2() {
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] expected = {4,9};

        Assertions.assertArrayEquals(expected, intersection.intersection(nums1, nums2));
    }
}