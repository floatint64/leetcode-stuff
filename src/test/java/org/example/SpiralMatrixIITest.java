package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIITest {

    @Test
    void generateMatrix() {
        SpiralMatrixII spiral = new SpiralMatrixII();

        int[][] expected = {
                {1,2,3},
                {8,9,4},
                {7,6,5}
        };

        Assertions.assertArrayEquals(expected, spiral.generateMatrix(3));
    }

    @Test
    void generateMatrix2() {
        SpiralMatrixII spiral = new SpiralMatrixII();

        int[][] expected = {
                {1,2},
                {4,3}
        };

        Assertions.assertArrayEquals(expected, spiral.generateMatrix(2));
    }

    @Test
    void generateMatrix3() {
        SpiralMatrixII spiral = new SpiralMatrixII();

        int[][] expected = {
                {1}
        };

        Assertions.assertArrayEquals(expected, spiral.generateMatrix(1));
    }
}