package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberWithAlternatingBitsTest {

    @Test
    void hasAlternatingBits() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 5;
        boolean expected = true;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits2() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 7;
        boolean expected = false;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits3() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 11;
        boolean expected = false;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits4() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 2;
        boolean expected = true;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits5() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 170;
        boolean expected = true;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits6() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 42;
        boolean expected = true;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits7() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 1431655765;
        boolean expected = true;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits8() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 1431656277;
        boolean expected = false;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBits9() {
        BinaryNumberWithAlternatingBits b = new BinaryNumberWithAlternatingBits();

        int n = 1;
        boolean expected = true;

        Assertions.assertEquals(expected, b.hasAlternatingBits(n));
    }
}