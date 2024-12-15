package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int exp = 6;

        Assertions.assertEquals(exp, maximumSubarray.maxSubArray(nums));
    }

    @Test
    void maxSubArray2() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();

        int[] nums = {1};
        int exp = 1;

        Assertions.assertEquals(exp, maximumSubarray.maxSubArray(nums));
    }

    @Test
    void maxSubArray3() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();

        int[] nums = {5, 4, -1, 7, 8};
        int exp = 23;

        Assertions.assertEquals(exp, maximumSubarray.maxSubArray(nums));
    }
}