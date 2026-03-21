package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipSquareSubmatrixVerticallyTest {

    @Test
    void reverseSubmatrix() {
        FlipSquareSubmatrixVertically f = new FlipSquareSubmatrixVertically();

        int[][] grid = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[][] expected = {
                {1,2,3,4},
                {13,14,15,8},
                {9,10,11,12},
                {5,6,7,16}
        };

        int x = 1;
        int y = 0;
        int k = 3;

        Assertions.assertArrayEquals(expected, f.reverseSubmatrix(grid, x, y, k));
    }

    @Test
    void reverseSubmatrix2() {
        FlipSquareSubmatrixVertically f = new FlipSquareSubmatrixVertically();

        int[][] grid = {
                {3,4,2,3},
                {2,3,4,2}
        };

        int[][] expected = {
                {3,4,4,2},
                {2,3,2,3}
        };

        int x = 0;
        int y = 2;
        int k = 2;

        Assertions.assertArrayEquals(expected, f.reverseSubmatrix(grid, x, y, k));
    }

    @Test
    void reverseSubmatrix3() {
        FlipSquareSubmatrixVertically f = new FlipSquareSubmatrixVertically();

        int[][] grid = {
                {1}
        };

        int[][] expected = {
                {1}
        };

        int x = 0;
        int y = 0;
        int k = 1;

        Assertions.assertArrayEquals(expected, f.reverseSubmatrix(grid, x, y, k));
    }

    @Test
    void reverseSubmatrix4() {
        FlipSquareSubmatrixVertically f = new FlipSquareSubmatrixVertically();

        int[][] grid = {
                {1,2},
                {3,4}
        };

        int[][] expected = {
                {1,2},
                {3,4}
        };

        int x = 0;
        int y = 1;
        int k = 1;

        Assertions.assertArrayEquals(expected, f.reverseSubmatrix(grid, x, y, k));
    }
}