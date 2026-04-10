package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceBetweenThreeEqualElementsITest {

    @Test
    void minimumDistance() {
        MinimumDistanceBetweenThreeEqualElementsI m = new MinimumDistanceBetweenThreeEqualElementsI();

        int[] nums = {1,2,1,1,3};
        int expected = 6;

        Assertions.assertEquals(expected, m.minimumDistance(nums));
    }

    @Test
    void minimumDistance2() {
        MinimumDistanceBetweenThreeEqualElementsI m = new MinimumDistanceBetweenThreeEqualElementsI();

        int[] nums = {1,1,2,3,2,1,2};
        int expected = 8;

        Assertions.assertEquals(expected, m.minimumDistance(nums));
    }

    @Test
    void minimumDistance3() {
        MinimumDistanceBetweenThreeEqualElementsI m = new MinimumDistanceBetweenThreeEqualElementsI();

        int[] nums = {1};
        int expected = -1;

        Assertions.assertEquals(expected, m.minimumDistance(nums));
    }

    @Test
    void minimumDistance4() {
        MinimumDistanceBetweenThreeEqualElementsI m = new MinimumDistanceBetweenThreeEqualElementsI();

        int[] nums = {1,2};
        int expected = -1;

        Assertions.assertEquals(expected, m.minimumDistance(nums));
    }

    @Test
    void minimumDistance5() {
        MinimumDistanceBetweenThreeEqualElementsI m = new MinimumDistanceBetweenThreeEqualElementsI();

        int[] nums = {1,2,1};
        int expected = -1;

        Assertions.assertEquals(expected, m.minimumDistance(nums));
    }

    @Test
    void minimumDistance6() {
        MinimumDistanceBetweenThreeEqualElementsI m = new MinimumDistanceBetweenThreeEqualElementsI();

        int[] nums = {1,2,2,2,1,4,1};
        int expected = 4;

        Assertions.assertEquals(expected, m.minimumDistance(nums));
    }

    @Test
    void minimumDistance7() {
        MinimumDistanceBetweenThreeEqualElementsI m = new MinimumDistanceBetweenThreeEqualElementsI();

        int[] nums = {5,3,5,5,5};
        int expected = 4;

        Assertions.assertEquals(expected, m.minimumDistance(nums));
    }
}