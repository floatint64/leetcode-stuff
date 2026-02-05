package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformedArrayTest {

    @Test
    void constructTransformedArray() {
        TransformedArray transformedArray = new TransformedArray();

        int[] nums = {3,-2,1,1};
        int[] expected = {1,1,1,3};

        Assertions.assertArrayEquals(expected, transformedArray.constructTransformedArray(nums));
    }

    @Test
    void constructTransformedArray2() {
        TransformedArray transformedArray = new TransformedArray();

        int[] nums = {-1,4,-1};
        int[] expected = {-1,-1,4};

        Assertions.assertArrayEquals(expected, transformedArray.constructTransformedArray(nums));
    }
}