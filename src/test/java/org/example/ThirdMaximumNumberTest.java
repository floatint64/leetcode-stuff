package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaximumNumberTest {

    @Test
    void thirdMax() {
        ThirdMaximumNumber third = new ThirdMaximumNumber();

        int[] nums = {3,2,1};
        int expected = 1;

        Assertions.assertEquals(expected, third.thirdMax(nums));
    }

    @Test
    void thirdMax2() {
        ThirdMaximumNumber third = new ThirdMaximumNumber();

        int[] nums = {1,2};
        int expected = 2;

        Assertions.assertEquals(expected, third.thirdMax(nums));
    }

    @Test
    void thirdMax3() {
        ThirdMaximumNumber third = new ThirdMaximumNumber();

        int[] nums = {2,2,3,1};
        int expected = 1;

        Assertions.assertEquals(expected, third.thirdMax(nums));
    }

    @Test
    void thirdMax4() {
        ThirdMaximumNumber third = new ThirdMaximumNumber();

        int[] nums = {10};
        int expected = 10;

        Assertions.assertEquals(expected, third.thirdMax(nums));
    }

    @Test
    void thirdMax5() {
        ThirdMaximumNumber third = new ThirdMaximumNumber();

        int[] nums = {1,2,2,3,3,3,4,4,4,6,6};
        int expected = 3;

        Assertions.assertEquals(expected, third.thirdMax(nums));
    }
}