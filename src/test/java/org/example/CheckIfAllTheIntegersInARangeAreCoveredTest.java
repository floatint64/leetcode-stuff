package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfAllTheIntegersInARangeAreCoveredTest {

    @Test
    void isCovered() {
        CheckIfAllTheIntegersInARangeAreCovered check = new CheckIfAllTheIntegersInARangeAreCovered();

        int[][] ranges = {
                {1,2},
                {3, 4},
                {5, 6}
        };

        int l = 2;
        int r = 5;

        Assertions.assertTrue(check.isCovered(ranges, l, r));
    }

    @Test
    void isCovered2() {
        CheckIfAllTheIntegersInARangeAreCovered check = new CheckIfAllTheIntegersInARangeAreCovered();

        int[][] ranges = {
                {1,10},
                {10, 20}
        };

        int l = 21;
        int r = 21;

        Assertions.assertFalse(check.isCovered(ranges, l, r));
    }

    @Test
    void isCovered3() {
        CheckIfAllTheIntegersInARangeAreCovered check = new CheckIfAllTheIntegersInARangeAreCovered();

        int[][] ranges = {
                {15,36},
                {15,23},{15,44},{30,49},{2,19},{27,36},{7,42},{12,41}
        };

        int l = 19;
        int r = 47;

        Assertions.assertTrue(check.isCovered(ranges, l, r));
    }
}