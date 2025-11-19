package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeepMultiplyingFoundValuesByTwoTest {

    @Test
    void findFinalValue() {
        KeepMultiplyingFoundValuesByTwo keep = new KeepMultiplyingFoundValuesByTwo();

        int[] nums = {5,3,6,1,12};
        int original = 3;
        int expected = 24;

        Assertions.assertEquals(expected, keep.findFinalValue(nums, original));
    }

    @Test
    void findFinalValue2() {
        KeepMultiplyingFoundValuesByTwo keep = new KeepMultiplyingFoundValuesByTwo();

        int[] nums = {2,7,9};
        int original = 4;
        int expected = 4;

        Assertions.assertEquals(expected, keep.findFinalValue(nums, original));
    }
}