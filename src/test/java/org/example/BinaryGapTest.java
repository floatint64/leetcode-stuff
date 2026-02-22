package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void binaryGap() {
        BinaryGap bg = new BinaryGap();

        int n = 22;
        int expected = 2;

        Assertions.assertEquals(expected, bg.binaryGap(n));
    }


    @Test
    void binaryGap2() {
        BinaryGap bg = new BinaryGap();

        int n = 8;
        int expected = 0;

        Assertions.assertEquals(expected, bg.binaryGap(n));
    }

    @Test
    void binaryGap3() {
        BinaryGap bg = new BinaryGap();

        int n = 5;
        int expected = 2;

        Assertions.assertEquals(expected, bg.binaryGap(n));
    }

    @Test
    void binaryGap4() {
        BinaryGap bg = new BinaryGap();

        int n = 19;
        int expected = 3;

        Assertions.assertEquals(expected, bg.binaryGap(n));
    }

    @Test
    void binaryGap5() {
        BinaryGap bg = new BinaryGap();

        int n = 2067;
        int expected = 7;

        Assertions.assertEquals(expected, bg.binaryGap(n));
    }

    @Test
    void binaryGap6() {
        BinaryGap bg = new BinaryGap();

        int n = 1;
        int expected = 0;

        Assertions.assertEquals(expected, bg.binaryGap(n));
    }

    @Test
    void binaryGap7() {
        BinaryGap bg = new BinaryGap();

        int n = 15;
        int expected = 1;

        Assertions.assertEquals(expected, bg.binaryGap(n));
    }
}