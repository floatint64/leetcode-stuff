package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleshipsInABoardTest {

    @Test
    void countBattleships() {
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();

        char[][] board = new char[][] {
                new char[] {'X','.','.','X'},
                new char[] {'.','.','.','X'},
                new char[] {'.','.','.','X'}
        };

        Assertions.assertEquals(2, battleshipsInABoard.countBattleships(board));
    }

    @Test
    void countBattleships2() {
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();

        char[][] board = new char[][] {
                new char[] {'X'}
        };

        Assertions.assertEquals(1, battleshipsInABoard.countBattleships(board));
    }

    @Test
    void countBattleships3() {
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();

        char[][] board = new char[][] {
                new char[] {'.'}
        };

        Assertions.assertEquals(0, battleshipsInABoard.countBattleships(board));
    }
}