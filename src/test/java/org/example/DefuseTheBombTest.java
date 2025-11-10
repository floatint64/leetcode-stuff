package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefuseTheBombTest {

    @Test
    void decrypt() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

        int[] code = {5,7,1,4};
        int k = 3;
        int[] expected = {12,10,16,13};

        Assertions.assertArrayEquals(expected, defuseTheBomb.decrypt(code, k));
    }
    @Test
    void decrypt2() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

        int[] code = {1,2,3,4};
        int k = 0;
        int[] expected = {0,0,0,0};

        Assertions.assertArrayEquals(expected, defuseTheBomb.decrypt(code, k));
    }

    @Test
    void decrypt3() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

        int[] code = {2,4,9,3};
        int k = -2;
        int[] expected = {12,5,6,13};

        Assertions.assertArrayEquals(expected, defuseTheBomb.decrypt(code, k));
    }

    @Test
    void decrypt4() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

        int[] code = {1,2,3};
        int k = 3;
        int[] expected = {6, 6, 6};

        Assertions.assertArrayEquals(expected, defuseTheBomb.decrypt(code, k));
    }

    @Test
    void decrypt5() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

        int[] code = {1};
        int k = 1;
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, defuseTheBomb.decrypt(code, k));
    }
}