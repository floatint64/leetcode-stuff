package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberGameTest {

    @Test
    void numberGame() {
        MinimumNumberGame min = new MinimumNumberGame();

        int[] nums = {5,4,2,3};
        int[] expected = {3,2,5,4};

        Assertions.assertArrayEquals(expected, min.numberGame(nums));
    }

    @Test
    void numberGame2() {
        MinimumNumberGame min = new MinimumNumberGame();

        int[] nums = {2,5};
        int[] expected = {5,2};

        Assertions.assertArrayEquals(expected, min.numberGame(nums));
    }
}