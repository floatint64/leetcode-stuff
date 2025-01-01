package org.example;

public class SurroundedRegions {
    private void markAsNotSurrounded(char[][] board, int y, int x) {
        if ((y >= 0 && y < board.length) && (x >= 0 && x < board[0].length)) {
            if (board[y][x] == 'O') {
                board[y][x] = '*';
                markAsNotSurrounded(board, y, x - 1);
                markAsNotSurrounded(board, y - 1, x);
                markAsNotSurrounded(board, y, x + 1);
                markAsNotSurrounded(board, y + 1, x);
            }
        }
    }

    public void solve(char[][] board) {
        // visit borders

        // left border
        for (int y = 0; y < board.length; y++) {
            markAsNotSurrounded(board, y, 0);
        }

        // top border
        for (int x = 0; x < board[0].length; x++) {
            markAsNotSurrounded(board, 0, x);
        }

        // right border

        for (int y = 0; y < board.length; y++) {
            markAsNotSurrounded(board, y, board[0].length - 1);
        }

        // bottom border

        for (int x = 0; x < board[0].length; x++) {
            markAsNotSurrounded(board, board.length - 1, x);
        }

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] == 'O') {
                    board[y][x] = 'X';
                } else if (board[y][x] == '*') {
                    board[y][x] = 'O';
                }
            }
        }
    }
}
