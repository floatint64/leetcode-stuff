package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandPerimeterTest {

    @Test
    void islandPerimeter() {
        IslandPerimeter islandPerimeter = new IslandPerimeter();

        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };

        Assertions.assertEquals(16, islandPerimeter.islandPerimeter(grid));
    }

    @Test
    void islandPerimeter2() {
        IslandPerimeter islandPerimeter = new IslandPerimeter();

        int[][] grid = {
                {1},
        };

        Assertions.assertEquals(4, islandPerimeter.islandPerimeter(grid));
    }

    @Test
    void islandPerimeter3() {
        IslandPerimeter islandPerimeter = new IslandPerimeter();

        int[][] grid = {
                {1, 0},
        };

        Assertions.assertEquals(4, islandPerimeter.islandPerimeter(grid));
    }
}