package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumXORForEachQueryTest {

    @Test
    void getMaximumXor() {
        MaximumXORForEachQuery maxXor = new MaximumXORForEachQuery();

        int[] nums = {0,1,1,3};
        int maximumBit = 2;

        int[] expected = {0,3,2,3};

        Assertions.assertArrayEquals(expected, maxXor.getMaximumXor(nums, maximumBit));
    }

    @Test
    void getMaximumXor2() {
        MaximumXORForEachQuery maxXor = new MaximumXORForEachQuery();

        int[] nums = {2,3,4,7};
        int maximumBit = 3;

        int[] expected = {5,2,6,5};

        Assertions.assertArrayEquals(expected, maxXor.getMaximumXor(nums, maximumBit));
    }

    @Test
    void getMaximumXor3() {
        MaximumXORForEachQuery maxXor = new MaximumXORForEachQuery();

        int[] nums = {0,1,2,2,5,7};
        int maximumBit = 3;

        int[] expected = {4,3,6,4,6,7};

        Assertions.assertArrayEquals(expected, maxXor.getMaximumXor(nums, maximumBit));
    }

    @Test
    void getMaximumXor4() {
        MaximumXORForEachQuery maxXor = new MaximumXORForEachQuery();

        int[] nums = {0};
        int maximumBit = 2;

        int[] expected = {3};

        Assertions.assertArrayEquals(expected, maxXor.getMaximumXor(nums, maximumBit));
    }
}