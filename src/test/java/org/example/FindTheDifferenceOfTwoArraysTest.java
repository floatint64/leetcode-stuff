package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceOfTwoArraysTest {

    @Test
    void findDifference() {
        FindTheDifferenceOfTwoArrays find = new FindTheDifferenceOfTwoArrays();

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        var expected = List.of(
                List.of(1,3),
                List.of(4,6)
        );

        Assertions.assertEquals(expected, find.findDifference(nums1, nums2));
    }

    @Test
    void findDifference2() {
        FindTheDifferenceOfTwoArrays find = new FindTheDifferenceOfTwoArrays();

        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        var expected = List.of(
                List.of(3),
                List.of()
        );

        Assertions.assertEquals(expected, find.findDifference(nums1, nums2));
    }
}