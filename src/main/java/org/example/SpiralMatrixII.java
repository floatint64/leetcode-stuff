package org.example;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int counter = 1;

        int left = 0;
        int right = result[0].length - 1;
        int top = 0;
        int bottom = result.length - 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                result[top][i] = counter++;
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = counter++;
            }

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = counter++;
                }

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = counter++;
                }

                left++;
            }
        }

        return result;
    }
}
