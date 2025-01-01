package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {

    @Test
    void solve() {

        SurroundedRegions surroundedRegions = new SurroundedRegions();

        char[][] board = new char[][]{
                new char[]{'X', 'X', 'X', 'X'},
                new char[]{'X', 'O', 'O', 'X'},
                new char[]{'X', 'X', 'O', 'X'},
                new char[]{'X', 'O', 'X', 'X'}
        };

        char[][] exp = new char[][]{
                new char[]{'X', 'X', 'X', 'X'},
                new char[]{'X', 'X', 'X', 'X'},
                new char[]{'X', 'X', 'X', 'X'},
                new char[]{'X', 'O', 'X', 'X'}
        };

        surroundedRegions.solve(board);

        Assertions.assertArrayEquals(exp, board);
    }
}