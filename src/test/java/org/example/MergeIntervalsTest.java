package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void merge() {

        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = new int[][] {
                {1,3}
        };

        int[][] exp = new int[][] {
                {1, 3}
        };

        Assertions.assertArrayEquals(exp, mergeIntervals.merge(intervals));
    }

    @Test
    void merge2() {

        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = new int[][] {
                {1,3},
                {2,6},
                {8,10},
                {15, 18}
        };

        int[][] exp = new int[][] {
                {1, 6},
                {8, 10},
                {15, 18}
        };

        Assertions.assertArrayEquals(exp, mergeIntervals.merge(intervals));
    }

    @Test
    void merge3() {

        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = new int[][] {
                {1,4}, {2,3}
        };

        int[][] exp = new int[][] {
                {1, 4}
        };

        Assertions.assertArrayEquals(exp, mergeIntervals.merge(intervals));
    }
}