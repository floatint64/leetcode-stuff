package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1dArrayTest {

    @Test
    void runningSum() {
        RunningSumOf1dArray run = new RunningSumOf1dArray();

        int[] nums = {1,2,3,4};
        int[] expected = {1,3,6,10};

        Assertions.assertArrayEquals(expected, run.runningSum(nums));
    }

    @Test
    void runningSum2() {
        RunningSumOf1dArray run = new RunningSumOf1dArray();

        int[] nums = {1,1,1,1,1};
        int[] expected = {1,2,3,4,5};

        Assertions.assertArrayEquals(expected, run.runningSum(nums));
    }

    @Test
    void runningSum3() {
        RunningSumOf1dArray run = new RunningSumOf1dArray();

        int[] nums = {3,1,2,10,1};
        int[] expected = {3,4,6,16,17};

        Assertions.assertArrayEquals(expected, run.runningSum(nums));
    }

    @Test
    void runningSum4() {
        RunningSumOf1dArray run = new RunningSumOf1dArray();

        int[] nums = {-1};
        int[] expected = {-1};

        Assertions.assertArrayEquals(expected, run.runningSum(nums));
    }
}