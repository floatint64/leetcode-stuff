package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDifferenceBetweenHighestAndLowestOfKScoresTest {

    @Test
    void minimumDifference() {
        MinimumDifferenceBetweenHighestAndLowestOfKScores min = new MinimumDifferenceBetweenHighestAndLowestOfKScores();

        int[] nums = {90};
        int k = 1;
        int expected = 0;

        Assertions.assertEquals(expected, min.minimumDifference(nums, k));
    }

    @Test
    void minimumDifference2() {
        MinimumDifferenceBetweenHighestAndLowestOfKScores min = new MinimumDifferenceBetweenHighestAndLowestOfKScores();

        int[] nums = {9,4,1,7};
        int k = 2;
        int expected = 2;

        Assertions.assertEquals(expected, min.minimumDifference(nums, k));
    }

    @Test
    void minimumDifference3() {
        MinimumDifferenceBetweenHighestAndLowestOfKScores min = new MinimumDifferenceBetweenHighestAndLowestOfKScores();

        int[] nums = {3,5,2,3};
        int k = 2;
        int expected = 0;

        Assertions.assertEquals(expected, min.minimumDifference(nums, k));
    }

    @Test
    void minimumDifference4() {
        MinimumDifferenceBetweenHighestAndLowestOfKScores min = new MinimumDifferenceBetweenHighestAndLowestOfKScores();

        int[] nums = {3,5};
        int k = 2;
        int expected = 2;

        Assertions.assertEquals(expected, min.minimumDifference(nums, k));
    }

    @Test
    void minimumDifference5() {
        MinimumDifferenceBetweenHighestAndLowestOfKScores min = new MinimumDifferenceBetweenHighestAndLowestOfKScores();

        int[] nums = {3,5};
        int k = 1;
        int expected = 0;

        Assertions.assertEquals(expected, min.minimumDifference(nums, k));
    }
}