package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPartitionTest {

    @Test
    void arrayPairSum() {
        ArrayPartition array = new ArrayPartition();

        int[] nums = {1,4,3,2};
        int expected = 4;

        Assertions.assertEquals(expected, array.arrayPairSum(nums));
    }

    @Test
    void arrayPairSum2() {
        ArrayPartition array = new ArrayPartition();

        int[] nums = {6,2,6,5,1,2};
        int expected = 9;

        Assertions.assertEquals(expected, array.arrayPairSum(nums));
    }

    @Test
    void arrayPairSum3() {
        ArrayPartition array = new ArrayPartition();

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int expected = 25;

        Assertions.assertEquals(expected, array.arrayPairSum(nums));
    }
}