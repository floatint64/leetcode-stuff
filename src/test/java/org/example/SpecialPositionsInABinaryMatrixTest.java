package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialPositionsInABinaryMatrixTest {

    @Test
    void numSpecial() {
        SpecialPositionsInABinaryMatrix s = new SpecialPositionsInABinaryMatrix();

        int[][] mat = {
                {1,0,0},
                {0,0,1},
                {1,0,0}
        };

        int expected = 1;

        Assertions.assertEquals(expected, s.numSpecial(mat));
    }

    @Test
    void numSpecial2() {
        SpecialPositionsInABinaryMatrix s = new SpecialPositionsInABinaryMatrix();

        int[][] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        int expected = 3;

        Assertions.assertEquals(expected, s.numSpecial(mat));
    }

    @Test
    void numSpecial3() {
        SpecialPositionsInABinaryMatrix s = new SpecialPositionsInABinaryMatrix();

        int[][] mat = {
                {1,0,1},
                {1,1,0},
                {0,1,1}
        };

        int expected = 0;

        Assertions.assertEquals(expected, s.numSpecial(mat));
    }
}