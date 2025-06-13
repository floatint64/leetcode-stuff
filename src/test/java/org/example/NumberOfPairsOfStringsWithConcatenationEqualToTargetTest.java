package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfPairsOfStringsWithConcatenationEqualToTargetTest {

    @Test
    void numOfPairs() {
        NumberOfPairsOfStringsWithConcatenationEqualToTarget numOfPairs = new NumberOfPairsOfStringsWithConcatenationEqualToTarget();

        String[] nums = {"777","7","77","77"};
        String target = "7777";

        Assertions.assertEquals(4, numOfPairs.numOfPairs(nums, target));
    }

    @Test
    void numOfPairs2() {
        NumberOfPairsOfStringsWithConcatenationEqualToTarget numOfPairs = new NumberOfPairsOfStringsWithConcatenationEqualToTarget();

        String[] nums = {"123","4","12","34"};
        String target = "1234";

        Assertions.assertEquals(2, numOfPairs.numOfPairs(nums, target));
    }


    @Test
    void numOfPairs3() {
        NumberOfPairsOfStringsWithConcatenationEqualToTarget numOfPairs = new NumberOfPairsOfStringsWithConcatenationEqualToTarget();

        String[] nums = {"1","1","1"};
        String target = "11";

        Assertions.assertEquals(6, numOfPairs.numOfPairs(nums, target));
    }

    @Test
    void numOfPairs4() {
        NumberOfPairsOfStringsWithConcatenationEqualToTarget numOfPairs = new NumberOfPairsOfStringsWithConcatenationEqualToTarget();

        String[] nums = {"1","1","1","1","1"};
        String target = "11";

        Assertions.assertEquals(20, numOfPairs.numOfPairs(nums, target));
    }
}