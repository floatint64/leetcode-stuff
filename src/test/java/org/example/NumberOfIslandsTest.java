package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    @Test
    void numIslands() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();

        char[][] grid = new char[][] {
                new char[] {'1','1','1','1','0'},
                new char[] {'1','1','0','1','0'},
                new char[] {'1','1','0','0','0'},
                new char[] {'0','0','0','0','0'}
        };

        Assertions.assertEquals(1, numberOfIslands.numIslands(grid));
    }

    @Test
    void numIslands2() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();

        char[][] grid = new char[][] {
                new char[] {'1','1','0','0','0'},
                new char[] {'1','1','0','0','0'},
                new char[] {'0','0','1','0','0'},
                new char[] {'0','0','0','1','1'}
        };

        Assertions.assertEquals(3, numberOfIslands.numIslands(grid));
    }
}