package org.example;

public class NumberOfIslands {
    private void visitCell(char[][] grid, int y, int x) {
        if ((y >= 0 && y < grid.length) && (x >= 0 && x < grid[0].length)) {
            if (grid[y][x] != '0') {
                grid[y][x] = '0';
                visitCell(grid, y, x - 1);
                visitCell(grid, y - 1, x);
                visitCell(grid, y, x + 1);
                visitCell(grid, y + 1, x);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == '1') {
                    count++;
                    visitCell(grid, y, x);
                }
            }
        }

        return count;
    }
}
