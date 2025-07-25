package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumUniqueSubarraySumAfterDeletionTest {

    @Test
    void maxSum() {
        MaximumUniqueSubarraySumAfterDeletion max = new MaximumUniqueSubarraySumAfterDeletion();

        int[] nums = {1,2,3,4,5};

        Assertions.assertEquals(15, max.maxSum(nums));
    }

    @Test
    void maxSum2() {
        MaximumUniqueSubarraySumAfterDeletion max = new MaximumUniqueSubarraySumAfterDeletion();

        int[] nums = {1,1,0,1,1};

        Assertions.assertEquals(1, max.maxSum(nums));
    }

    @Test
    void maxSum3() {
        MaximumUniqueSubarraySumAfterDeletion max = new MaximumUniqueSubarraySumAfterDeletion();

        int[] nums = {1,2,-1,-2,1,0,-1};

        Assertions.assertEquals(3, max.maxSum(nums));
    }

    @Test
    void maxSum4() {
        MaximumUniqueSubarraySumAfterDeletion max = new MaximumUniqueSubarraySumAfterDeletion();

        int[] nums = {-1,-2,-3,-4};

        Assertions.assertEquals(-1, max.maxSum(nums));
    }

    @Test
    void maxSum5() {
        MaximumUniqueSubarraySumAfterDeletion max = new MaximumUniqueSubarraySumAfterDeletion();

        int[] nums = {-1,0};

        Assertions.assertEquals(0, max.maxSum(nums));
    }

    @Test
    void maxSum6() {
        MaximumUniqueSubarraySumAfterDeletion max = new MaximumUniqueSubarraySumAfterDeletion();

        int[] nums = {-1};

        Assertions.assertEquals(-1, max.maxSum(nums));
    }

    @Test
    void maxSum7() {
        MaximumUniqueSubarraySumAfterDeletion max = new MaximumUniqueSubarraySumAfterDeletion();

        int[] nums = {-20, 20};

        Assertions.assertEquals(20, max.maxSum(nums));
    }
}