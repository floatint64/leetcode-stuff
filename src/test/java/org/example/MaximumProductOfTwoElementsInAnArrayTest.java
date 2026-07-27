package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    void maxProduct() {

        MaximumProductOfTwoElementsInAnArray m = new MaximumProductOfTwoElementsInAnArray();

        var nums = new int[]{3,4,5,2};
        int expected = 12;

        Assertions.assertEquals(expected, m.maxProduct(nums));
    }

    @Test
    void maxProduct2() {

        MaximumProductOfTwoElementsInAnArray m = new MaximumProductOfTwoElementsInAnArray();

        var nums = new int[]{1,5,4,5};
        int expected = 16;

        Assertions.assertEquals(expected, m.maxProduct(nums));
    }

    @Test
    void maxProduct3() {

        MaximumProductOfTwoElementsInAnArray m = new MaximumProductOfTwoElementsInAnArray();

        var nums = new int[]{3,7};
        int expected = 12;

        Assertions.assertEquals(expected, m.maxProduct(nums));
    }
}