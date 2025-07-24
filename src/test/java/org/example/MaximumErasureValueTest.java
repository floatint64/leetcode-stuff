package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumErasureValueTest {

    @Test
    void maximumUniqueSubarray() {
        MaximumErasureValue max = new MaximumErasureValue();

        int[] nums = {4,2,4,5,6};

        Assertions.assertEquals(17, max.maximumUniqueSubarray(nums));
    }

    @Test
    void maximumUniqueSubarray2() {
        MaximumErasureValue max = new MaximumErasureValue();

        int[] nums = {5,2,1,2,5,2,1,2,5};

        Assertions.assertEquals(8, max.maximumUniqueSubarray(nums));
    }

    @Test
    void maximumUniqueSubarray3() {
        MaximumErasureValue max = new MaximumErasureValue();

        int[] nums = {1,2,3,1,1,4,5,6,7,1};

        Assertions.assertEquals(23, max.maximumUniqueSubarray(nums));
    }

    @Test
    void maximumUniqueSubarray4() {
        MaximumErasureValue max = new MaximumErasureValue();

        int[] nums = {1,1,1,1,1,1,1,1,};

        Assertions.assertEquals(1, max.maximumUniqueSubarray(nums));
    }

    @Test
    void maximumUniqueSubarray5() {
        MaximumErasureValue max = new MaximumErasureValue();

        int[] nums = {1,2,3,4,5};

        Assertions.assertEquals(15, max.maximumUniqueSubarray(nums));
    }

    @Test
    void maximumUniqueSubarray6() {
        MaximumErasureValue max = new MaximumErasureValue();

        int[] nums = {10000,1,10000,1,1,1,1,1,1};

        Assertions.assertEquals(10001, max.maximumUniqueSubarray(nums));
    }
}