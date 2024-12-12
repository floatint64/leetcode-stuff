package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();

        int[] nums = {2, 7, 11, 15};

        int[] pos = {0, 1};

        Assertions.assertArrayEquals(pos, twoSum.twoSum(nums, 9));
    }

    @Test
    void twoSum2() {
        TwoSum twoSum = new TwoSum();

        int[] nums = {1, 2, 3, 4, 5};

        int[] pos = {1, 4};

        Assertions.assertArrayEquals(pos, twoSum.twoSum(nums, 7));
    }

    @Test
    void twoSum3() {
        TwoSum twoSum = new TwoSum();

        int[] nums = {3, 2, 4};

        int[] pos = {1, 2};

        Assertions.assertArrayEquals(pos, twoSum.twoSum(nums, 6));
    }

    @Test
    void twoSum4() {
        TwoSum twoSum = new TwoSum();

        int[] nums = {3, 3};

        int[] pos = {0, 1};

        Assertions.assertArrayEquals(pos, twoSum.twoSum(nums, 6));
    }
}