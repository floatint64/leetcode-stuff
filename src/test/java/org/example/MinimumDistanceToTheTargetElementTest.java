package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceToTheTargetElementTest {

    @Test
    void getMinDistance() {
        MinimumDistanceToTheTargetElement m = new MinimumDistanceToTheTargetElement();

        int[] nums = {1,2,3,4,5};
        int target = 5;
        int start = 3;
        int expected = 1;

        Assertions.assertEquals(expected, m.getMinDistance(nums, target, start));
    }

    @Test
    void getMinDistance2() {
        MinimumDistanceToTheTargetElement m = new MinimumDistanceToTheTargetElement();

        int[] nums = {1};
        int target = 1;
        int start = 0;
        int expected = 0;

        Assertions.assertEquals(expected, m.getMinDistance(nums, target, start));
    }

    @Test
    void getMinDistance3() {
        MinimumDistanceToTheTargetElement m = new MinimumDistanceToTheTargetElement();

        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1;
        int start = 0;
        int expected = 0;

        Assertions.assertEquals(expected, m.getMinDistance(nums, target, start));
    }
}