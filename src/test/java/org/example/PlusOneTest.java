package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void plusOne() {
        PlusOne plus = new PlusOne();

        int[] nums = {1, 2, 3};


        Assertions.assertArrayEquals(new int[] {1, 2, 4}, plus.plusOne(nums));
    }

    @Test
    void plusOne2() {
        PlusOne plus = new PlusOne();

        int[] nums = {4,3,2,1};


        Assertions.assertArrayEquals(new int[] {4,3,2,2}, plus.plusOne(nums));
    }

    @Test
    void plusOne3() {
        PlusOne plus = new PlusOne();

        int[] nums = {9};


        Assertions.assertArrayEquals(new int[] {1,0}, plus.plusOne(nums));
    }
}