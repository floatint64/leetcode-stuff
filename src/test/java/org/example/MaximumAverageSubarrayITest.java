package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    @Test
    void findMaxAverage() {
        MaximumAverageSubarrayI max = new MaximumAverageSubarrayI();

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double expected = 12.75000;

        Assertions.assertEquals(expected, max.findMaxAverage(nums, k), 0.00001);
    }

    @Test
    void findMaxAverage2() {
        MaximumAverageSubarrayI max = new MaximumAverageSubarrayI();

        int[] nums = {5};
        int k = 1;
        double expected = 5.0;

        Assertions.assertEquals(expected, max.findMaxAverage(nums, k), 0.00001);
    }

    @Test
    void findMaxAverage3() {
        MaximumAverageSubarrayI max = new MaximumAverageSubarrayI();

        int[] nums = {1,1,1,4};
        int k = 3;
        double expected = 2.0;

        Assertions.assertEquals(expected, max.findMaxAverage(nums, k), 0.00001);
    }
}