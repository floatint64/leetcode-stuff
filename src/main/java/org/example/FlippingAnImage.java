package org.example;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int y = 0; y < image.length; y++) {
            int l = 0;
            int r = image[y].length - 1;

            while (l < r) {
                int tmp = image[y][l];
                image[y][l] = image[y][r];
                image[y][r] = tmp;
                image[y][l] ^= 1;
                l++;
                r--;
            }
            for (int x = l; x < image[y].length; x++) {
                image[y][x] ^= 1;
            }
        }

        return image;
    }
}
