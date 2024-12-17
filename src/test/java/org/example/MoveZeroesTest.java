package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] nums = {0,1,0,3,12};
        int[] exp = {1,3,12,0,0};

        moveZeroes.moveZeroes(nums);

        Assertions.assertArrayEquals(exp, nums);
    }

    @Test
    void moveZeroes2() {
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] nums = {0};
        int[] exp = {0};

        moveZeroes.moveZeroes(nums);

        Assertions.assertArrayEquals(exp, nums);
    }

    @Test
    void moveZeroes3() {
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] nums = {1,2,0,3,0,0,4};
        int[] exp = {1,2,3,4,0,0,0};

        moveZeroes.moveZeroes(nums);

        Assertions.assertArrayEquals(exp, nums);
    }
}