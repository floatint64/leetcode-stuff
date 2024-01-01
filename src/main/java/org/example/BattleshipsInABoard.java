package org.example;

public class BattleshipsInABoard {
    private enum MoveDir {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public int countBattleships(char[][] board) {
        int result = 0;

        boolean[][] mask = new boolean[board.length][board[0].length];

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (!(board[y][x] == '.')) {
                    // not visited start point
                    if (!mask[y][x]) {
                        // detect ship direction
                        MoveDir shipDir;
                        // left
                        if (x - 1 >= 0 && board[y][x - 1] == 'X' && !mask[y][x - 1]) {
                            shipDir = MoveDir.LEFT;
                        }
                        // up
                        else if (y - 1 >= 0 && board[y - 1][x] == 'X' && !mask[y - 1][x]) {
                            shipDir = MoveDir.UP;
                        }
                        // right
                        else if (x + 1 < board[0].length && board[y][x + 1] == 'X' && !mask[y][x + 1]) {
                            shipDir = MoveDir.RIGHT;
                        }
                        // down
                        else if (y + 1 < board.length && board[y + 1][x] == 'X' && !mask[y + 1][x]) {
                            shipDir = MoveDir.DOWN;
                        }
                        // single cell ship
                        else {
                            mask[y][x] = true;
                            result++;
                            continue;
                        }

                        // get whole ship

                        boolean hasNext = true;
                        int tmpY = y;
                        int tmpX = x;
                        while (hasNext) {
                            mask[tmpY][tmpX] = true;
                            switch (shipDir) {
                                case LEFT: {
                                    tmpX--;
                                    break;
                                }
                                case UP: {
                                    tmpY--;
                                    break;
                                }
                                case RIGHT: {
                                    tmpX++;
                                    break;
                                }
                                case DOWN: {
                                    tmpY++;
                                }
                            }
                            hasNext = (tmpY >= 0 && tmpY < board.length)
                                    && (tmpX >= 0 && tmpX < board[0].length)
                                    && board[tmpY][tmpX] == 'X'
                                    && !mask[tmpY][tmpX];
                        }

                        result++;
                    }
                }  else {
                    mask[y][x] = true;
                }
            }
        }

        return result;
    }
}
