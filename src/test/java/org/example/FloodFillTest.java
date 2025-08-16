package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void floodFill() {
        FloodFill floodFill = new FloodFill();

        int[][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        int[][] expected = {
                {2,2,2},
                {2,2,0},
                {2,0,1}
        };

        Assertions.assertArrayEquals(expected, floodFill.floodFill(image, 1,1,2));
    }

    @Test
    void floodFill2() {
        FloodFill floodFill = new FloodFill();

        int[][] image = {
                {0,0,0},
                {0,0,0}
        };

        int[][] expected = {
                {0,0,0},
                {0,0,0}
        };

        Assertions.assertArrayEquals(expected, floodFill.floodFill(image, 0,0,0));
    }
}