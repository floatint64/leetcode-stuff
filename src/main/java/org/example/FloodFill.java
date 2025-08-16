package org.example;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        setPixel(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void setPixel(int[][] image, int y, int x, int originalColor, int color) {
        if (y < 0 || y >= image.length || x < 0 || x >= image[0].length) {
            return;
        }

        if (image[y][x] == color) {
            return;
        }

        if (image[y][x] == originalColor) {
            image[y][x] = color;
            setPixel(image, y - 1, x, originalColor, color);
            setPixel(image, y, x + 1, originalColor, color);
            setPixel(image, y + 1, x, originalColor, color);
            setPixel(image, y, x - 1, originalColor, color);
        }
    }
}
