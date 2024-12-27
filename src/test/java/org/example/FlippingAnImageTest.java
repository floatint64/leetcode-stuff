package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlippingAnImageTest {

    @Test
    void flipAndInvertImage() {
        FlippingAnImage flippingAnImage = new FlippingAnImage();

        int[][] arr = new int[][] {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] exp = new int[][] {
            {1, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };

        Assertions.assertArrayEquals(exp, flippingAnImage.flipAndInvertImage(arr));
    }

    @Test
    void flipAndInvertImage2() {
        FlippingAnImage flippingAnImage = new FlippingAnImage();

        int[][] arr = new int[][] {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        int[][] exp = new int[][] {
                {1,1,0,0},
                {0,1,1,0},
                {0,0,0,1},
                {1,0,1,0}
        };

        Assertions.assertArrayEquals(exp, flippingAnImage.flipAndInvertImage(arr));
    }
}