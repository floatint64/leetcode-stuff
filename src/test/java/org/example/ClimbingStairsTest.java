package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        Assertions.assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    void climbStairs2() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        Assertions.assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    void climbStairs3() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        Assertions.assertEquals(8, climbingStairs.climbStairs(5));
    }
}