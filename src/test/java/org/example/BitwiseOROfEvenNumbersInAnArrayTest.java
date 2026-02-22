package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseOROfEvenNumbersInAnArrayTest {

    @Test
    void evenNumberBitwiseORs() {
        BitwiseOROfEvenNumbersInAnArray b = new BitwiseOROfEvenNumbersInAnArray();

        int[] nums = {1,2,3,4,5,6};
        int expected = 6;

        Assertions.assertEquals(expected, b.evenNumberBitwiseORs(nums));
    }

    @Test
    void evenNumberBitwiseORs2() {
        BitwiseOROfEvenNumbersInAnArray b = new BitwiseOROfEvenNumbersInAnArray();

        int[] nums = {7,9,11};
        int expected = 0;

        Assertions.assertEquals(expected, b.evenNumberBitwiseORs(nums));
    }

    @Test
    void evenNumberBitwiseORs3() {
        BitwiseOROfEvenNumbersInAnArray b = new BitwiseOROfEvenNumbersInAnArray();

        int[] nums = {1,8,16};
        int expected = 24;

        Assertions.assertEquals(expected, b.evenNumberBitwiseORs(nums));
    }

    @Test
    void evenNumberBitwiseORs4() {
        BitwiseOROfEvenNumbersInAnArray b = new BitwiseOROfEvenNumbersInAnArray();

        int[] nums = {1};
        int expected = 0;

        Assertions.assertEquals(expected, b.evenNumberBitwiseORs(nums));
    }

    @Test
    void evenNumberBitwiseORs5() {
        BitwiseOROfEvenNumbersInAnArray b = new BitwiseOROfEvenNumbersInAnArray();

        int[] nums = {2};
        int expected = 2;

        Assertions.assertEquals(expected, b.evenNumberBitwiseORs(nums));
    }
}