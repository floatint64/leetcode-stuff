package org.example;

public class CheckIfGridSatisfiesConditions {
    public boolean satisfiesConditions(int[][] grid) {
        int prevCellVal = -1;
        for (int x = 0; x < grid[0].length; x++) {
            int cellVal = grid[0][x];
            if (prevCellVal == cellVal) {
                return false;
            }
            for (int y = 0; y < grid.length; y++) {
                if (cellVal != grid[y][x]) {
                    return false;
                }
            }
            prevCellVal = cellVal;
        }

        return true;
    }
}
