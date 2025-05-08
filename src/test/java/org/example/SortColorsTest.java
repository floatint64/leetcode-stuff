package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    @Test
    void sortColors() {
        SortColors sortColors = new SortColors();

        int[] nums = {1, 0, 2, 1, 1, 2, 0, 2};
        int[] expected = {0,0,1,1,1,2,2,2};

        sortColors.sortColors(nums);

        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    void sortColors2() {
        SortColors sortColors = new SortColors();

        int[] nums = {2,0,1};
        int[] expected = {0,1,2};

        sortColors.sortColors(nums);

        Assertions.assertArrayEquals(expected, nums);
    }
}