package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalArrayStateAfterKMultiplicationOperationsITest {

    @Test
    void getFinalState() {
        FinalArrayStateAfterKMultiplicationOperationsI f = new FinalArrayStateAfterKMultiplicationOperationsI();

        int[] nums = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;

        int[] expected = {8,4,6,5,6};

        Assertions.assertArrayEquals(expected, f.getFinalState(nums, k, multiplier));
    }

    @Test
    void getFinalState2() {
        FinalArrayStateAfterKMultiplicationOperationsI f = new FinalArrayStateAfterKMultiplicationOperationsI();

        int[] nums = {1,2};
        int k = 3;
        int multiplier = 4;

        int[] expected = {16,8};

        Assertions.assertArrayEquals(expected, f.getFinalState(nums, k, multiplier));
    }

    @Test
    void getFinalState3() {
        FinalArrayStateAfterKMultiplicationOperationsI f = new FinalArrayStateAfterKMultiplicationOperationsI();

        int[] nums = {1};
        int k = 3;
        int multiplier = 2;

        int[] expected = {8};

        Assertions.assertArrayEquals(expected, f.getFinalState(nums, k, multiplier));
    }

    @Test
    void getFinalState4() {
        FinalArrayStateAfterKMultiplicationOperationsI f = new FinalArrayStateAfterKMultiplicationOperationsI();

        int[] nums = {1,2,3};
        int k = 3;
        int multiplier = 2;

        int[] expected = {4,4,3};

        Assertions.assertArrayEquals(expected, f.getFinalState(nums, k, multiplier));
    }
}