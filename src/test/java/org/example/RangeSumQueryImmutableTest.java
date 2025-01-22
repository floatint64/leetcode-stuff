package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQueryImmutableTest {

    @Test
    void sumRange() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable range = new RangeSumQueryImmutable(nums);

        Assertions.assertEquals(1, range.sumRange(0, 2));
        Assertions.assertEquals(-1, range.sumRange(2, 5));
        Assertions.assertEquals(-3, range.sumRange(0, 5));
    }
}