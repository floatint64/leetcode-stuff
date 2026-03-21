package org.example;

public class FlipSquareSubmatrixVertically {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int yi = y; yi < y + k; yi++) {
            int xi = x;
            int xj = x + k - 1;

            while (xi < xj) {
                int tmp = grid[xi][yi];
                grid[xi][yi] = grid[xj][yi];
                grid[xj][yi] = tmp;
                xi++;
                xj--;
            }

        }

        return grid;
    }
}
