package org.example.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixSimilarityAfterCyclicShiftsTest {

    @Test
    void areSimilar() {
        MatrixSimilarityAfterCyclicShifts m = new MatrixSimilarityAfterCyclicShifts();

        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int k = 4;

        boolean expected = false;

        Assertions.assertEquals(expected, m.areSimilar(mat, k));
    }

    @Test
    void areSimilar2() {
        MatrixSimilarityAfterCyclicShifts m = new MatrixSimilarityAfterCyclicShifts();

        int[][] mat = {
                {1,2,1,2},
                {5,5,5,5},
                {6,3,6,3}
        };

        int k = 2;

        boolean expected = true;

        Assertions.assertEquals(expected, m.areSimilar(mat, k));
    }

    @Test
    void areSimilar3() {
        MatrixSimilarityAfterCyclicShifts m = new MatrixSimilarityAfterCyclicShifts();

        int[][] mat = {
                {2,2},
                {2,2}
        };

        int k = 3;

        boolean expected = true;

        Assertions.assertEquals(expected, m.areSimilar(mat, k));
    }

    @Test
    void areSimilar4() {
        MatrixSimilarityAfterCyclicShifts m = new MatrixSimilarityAfterCyclicShifts();

        int[][] mat = {
                {1}
        };

        int k = 3;

        boolean expected = true;

        Assertions.assertEquals(expected, m.areSimilar(mat, k));
    }

    @Test
    void areSimilar5() {
        MatrixSimilarityAfterCyclicShifts m = new MatrixSimilarityAfterCyclicShifts();

        int[][] mat = {
                {1,2},
                {2,1}
        };

        int k = 2;

        boolean expected = true;

        Assertions.assertEquals(expected, m.areSimilar(mat, k));
    }
}