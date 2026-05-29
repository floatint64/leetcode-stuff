package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumElementAfterReplacementWithDigitSumTest {

    @Test
    void minElement() {
        MinimumElementAfterReplacementWithDigitSum m = new MinimumElementAfterReplacementWithDigitSum();

        int[] nums = {10,12,13,14};
        int expected = 1;

        Assertions.assertEquals(expected, m.minElement(nums));
    }

    @Test
    void minElement2() {
        MinimumElementAfterReplacementWithDigitSum m = new MinimumElementAfterReplacementWithDigitSum();

        int[] nums = {1,2,3,4};
        int expected = 1;

        Assertions.assertEquals(expected, m.minElement(nums));
    }

    @Test
    void minElement3() {
        MinimumElementAfterReplacementWithDigitSum m = new MinimumElementAfterReplacementWithDigitSum();

        int[] nums = {999,19,199};
        int expected = 10;

        Assertions.assertEquals(expected, m.minElement(nums));
    }

    @Test
    void minElement4() {
        MinimumElementAfterReplacementWithDigitSum m = new MinimumElementAfterReplacementWithDigitSum();

        int[] nums = {54, 80};
        int expected = 8;

        Assertions.assertEquals(expected, m.minElement(nums));
    }
}