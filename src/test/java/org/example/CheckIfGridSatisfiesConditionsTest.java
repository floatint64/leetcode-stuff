package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfGridSatisfiesConditionsTest {

    @Test
    void satisfiesConditions() {

        CheckIfGridSatisfiesConditions check = new CheckIfGridSatisfiesConditions();

        int[][] grid = {
                {1,0,2},
                {1,0,2}
        };

        Assertions.assertTrue(check.satisfiesConditions(grid));
    }

    @Test
    void satisfiesConditions2() {

        CheckIfGridSatisfiesConditions check = new CheckIfGridSatisfiesConditions();

        int[][] grid = {
                {1,1,1},
                {0,0,0}
        };

        Assertions.assertFalse(check.satisfiesConditions(grid));
    }

    @Test
    void satisfiesConditions3() {

        CheckIfGridSatisfiesConditions check = new CheckIfGridSatisfiesConditions();

        int[][] grid = {
                {1},
                {2},
                {3}
        };

        Assertions.assertFalse(check.satisfiesConditions(grid));
    }

    @Test
    void satisfiesConditions4() {

        CheckIfGridSatisfiesConditions check = new CheckIfGridSatisfiesConditions();

        int[][] grid = {
                {0}
        };

        Assertions.assertTrue(check.satisfiesConditions(grid));
    }

    @Test
    void satisfiesConditions5() {

        CheckIfGridSatisfiesConditions check = new CheckIfGridSatisfiesConditions();

        int[][] grid = {
                {0,0},
                {0,0}
        };

        Assertions.assertFalse(check.satisfiesConditions(grid));
    }
}