package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalListIntersectionsTest {

    @Test
    void intervalIntersection() {
        IntervalListIntersections interval = new IntervalListIntersections();

       int[][] list1 = {{0,2},{5,10},{13,23},{24,25}};
       int[][] list2 = {{1,5},{8,12},{15,24},{25,26}};

        int[][] expected = {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection2() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {{1,3},{5,9}};
        int[][] list2 = {};

        int[][] expected = {};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection3() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {{0,10}};
        int[][] list2 = {{1,2},{3,5}, {6,8}};

        int[][] expected = {{1,2},{3,5}, {6,8}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection4() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {{0,10}};
        int[][] list2 = {{1,2},{3,5}, {9,13}};

        int[][] expected = {{1,2},{3,5}, {9,10}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection5() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {{0,10}};
        int[][] list2 = {{0,10}};

        int[][] expected = {{0,10}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection6() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {};
        int[][] list2 = {};

        int[][] expected = {};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection7() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {{1,3}, {3,5}, {5, 10}};
        int[][] list2 = {{1,10}};

        int[][] expected = {{1,3},{3,5},{5,10}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection8() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {{10,12},{18,19}};
        int[][] list2 = {{1,6},{8,11},{13,17},{19,20}};

        int[][] expected = {{10,11},{19,19}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection9() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list2 = {{10,12},{18,19}};
        int[][] list1 = {{1,6},{8,11},{13,17},{19,20}};

        int[][] expected = {{10,11},{19,19}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection10() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list1 = {{0,3},{4,7},{8, 10}};
        int[][] list2 = {{3,4},{7,8},{8,11}};

        int[][] expected = {{3,3},{4,4},{7,7},{8,8},{8,10}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }

    @Test
    void intervalIntersection11() {
        IntervalListIntersections interval = new IntervalListIntersections();

        int[][] list2 = {{0,3},{4,7},{8, 10}};
        int[][] list1 = {{3,4},{7,8},{8,11}};

        int[][] expected = {{3,3},{4,4},{7,7},{8,8},{8,10}};

        Assertions.assertArrayEquals(expected, interval.intervalIntersection(list1, list2));
    }
}