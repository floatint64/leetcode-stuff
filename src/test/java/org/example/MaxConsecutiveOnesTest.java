package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    @Test
    void findMaxConsecutiveOnes() {
        MaxConsecutiveOnes max = new MaxConsecutiveOnes();

        int[] nums = {1,1,1,1,1};

        Assertions.assertEquals(5, max.findMaxConsecutiveOnes(nums));
    }

    @Test
    void findMaxConsecutiveOnes2() {
        MaxConsecutiveOnes max = new MaxConsecutiveOnes();

        int[] nums = {1,1,0,1,1,1};

        Assertions.assertEquals(3, max.findMaxConsecutiveOnes(nums));
    }

    @Test
    void findMaxConsecutiveOnes3() {
        MaxConsecutiveOnes max = new MaxConsecutiveOnes();

        int[] nums = {1,0,1,1,0,1};

        Assertions.assertEquals(2, max.findMaxConsecutiveOnes(nums));
    }

    @Test
    void findMaxConsecutiveOnes4() {
        MaxConsecutiveOnes max = new MaxConsecutiveOnes();

        int[] nums = {0,0,0};

        Assertions.assertEquals(0, max.findMaxConsecutiveOnes(nums));
    }

    @Test
    void findMaxConsecutiveOnes5() {
        MaxConsecutiveOnes max = new MaxConsecutiveOnes();

        int[] nums = {0,0,1,1,1,0,0,1,1,1,1,1,1,1,0,0,0,0,0,1,1,1};

        Assertions.assertEquals(7, max.findMaxConsecutiveOnes(nums));
    }
}