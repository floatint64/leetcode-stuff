package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByIncreasingFrequencyTest {

    @Test
    void frequencySort() {
        SortArrayByIncreasingFrequency s = new SortArrayByIncreasingFrequency();

        int[] nums = {1,1,2,2,2,3};
        int[] expected = {3,1,1,2,2,2};

        Assertions.assertArrayEquals(expected, s.frequencySort(nums));
    }

    @Test
    void frequencySort2() {
        SortArrayByIncreasingFrequency s = new SortArrayByIncreasingFrequency();

        int[] nums = {2,3,1,3,2};
        int[] expected = {1,3,3,2,2};

        Assertions.assertArrayEquals(expected, s.frequencySort(nums));
    }

    @Test
    void frequencySort3() {
        SortArrayByIncreasingFrequency s = new SortArrayByIncreasingFrequency();

        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        int[] expected = {5,-1,4,4,-6,-6,1,1,1};

        Assertions.assertArrayEquals(expected, s.frequencySort(nums));
    }

    @Test
    void frequencySort4() {
        SortArrayByIncreasingFrequency s = new SortArrayByIncreasingFrequency();

        int[] nums = {1};
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, s.frequencySort(nums));
    }
}