package org.example;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rowMask = new int[board.length][board[0].length + 1];
        int[][] columnMask = new int[board[0].length][board[0].length + 1];

        for (int y = 0; y < board.length; y += 3) {
            for (int x = 0; x < board[0].length; x += 3) {
                int skipped = 0;
                int checked = 0;
                int subBits = 0;
                for (int yj = y; yj < y + 3; yj++) {
                    for (int xj = x; xj < x + 3; xj++) {
                        char val = board[yj][xj];
                        if (val == '.') {
                            skipped++;
                        } else {
                            int t = 1 << (val - '0');
                            if (rowMask[yj][val - '0'] > 0 || columnMask[xj][val - '0'] > 0 || (subBits & t) > 0) {
                                return false;
                            }

                            checked += (rowMask[yj][val - '0'] | columnMask[xj][val - '0']) ^ 1;
                            rowMask[yj][val - '0'] = 1;
                            columnMask[xj][val - '0'] = 1;
                            subBits |= t;
                        }
                    }
                }
                if (checked + skipped < 9) {
                    return false;
                }
            }

        }

        return true;
    }
}
