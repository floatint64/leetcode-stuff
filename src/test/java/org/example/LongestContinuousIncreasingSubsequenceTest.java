package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestContinuousIncreasingSubsequenceTest {

    @Test
    void findLengthOfLCIS() {
        LongestContinuousIncreasingSubsequence max = new LongestContinuousIncreasingSubsequence();

        int[] nums = {1,3,5,4,7};

        Assertions.assertEquals(3, max.findLengthOfLCIS(nums));
    }

    @Test
    void findLengthOfLCIS2() {
        LongestContinuousIncreasingSubsequence max = new LongestContinuousIncreasingSubsequence();

        int[] nums = {2,2,2,2,2};

        Assertions.assertEquals(1, max.findLengthOfLCIS(nums));
    }

    @Test
    void findLengthOfLCIS3() {
        LongestContinuousIncreasingSubsequence max = new LongestContinuousIncreasingSubsequence();

        int[] nums = {1,2,3,2,2,1,3,5,6,7,8};

        Assertions.assertEquals(6, max.findLengthOfLCIS(nums));
    }

    @Test
    void findLengthOfLCIS4() {
        LongestContinuousIncreasingSubsequence max = new LongestContinuousIncreasingSubsequence();

        int[] nums = {1,2,-3,2,3,4,3,5,6,7,8};

        Assertions.assertEquals(5, max.findLengthOfLCIS(nums));
    }

    @Test
    void findLengthOfLCIS5() {
        LongestContinuousIncreasingSubsequence max = new LongestContinuousIncreasingSubsequence();

        int[] nums = {3,2,1};

        Assertions.assertEquals(0, max.findLengthOfLCIS(nums));
    }

}