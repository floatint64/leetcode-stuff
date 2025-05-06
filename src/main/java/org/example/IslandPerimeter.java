package org.example;

public class IslandPerimeter {
    private static int islandPerimeter(int[][] grid, int y, int x) {
        if (y < 0 || y >= grid.length || x < 0 || x >= grid[0].length) {
            return 1;
        }

        if (grid[y][x] == -1) {
            return 0;
        }

        if (grid[y][x] == 0) {
            return 1;
        }

        grid[y][x] = -grid[y][x];

        return islandPerimeter(grid, y - 1, x) +
                islandPerimeter(grid, y, x - 1) +
                islandPerimeter(grid, y + 1, x) +
                islandPerimeter(grid, y, x + 1);
    }
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int y = 0; y < grid.length; y++){
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 0 || grid[y][x] == -1) {
                    continue;
                }
                res += islandPerimeter(grid, y, x);
            }
        }

        return res;
    }
}
