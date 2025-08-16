package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum69NumberTest {

    @Test
    void maximum69Number() {
        Maximum69Number max = new Maximum69Number();

        int num = 9669;
        int expected = 9969;

        Assertions.assertEquals(expected, max.maximum69Number(num));
    }

    @Test
    void maximum69Number2() {
        Maximum69Number max = new Maximum69Number();

        int num = 9996;
        int expected = 9999;

        Assertions.assertEquals(expected, max.maximum69Number(num));
    }

    @Test
    void maximum69Number3() {
        Maximum69Number max = new Maximum69Number();

        int num = 9999;
        int expected = 9999;

        Assertions.assertEquals(expected, max.maximum69Number(num));
    }

    @Test
    void maximum69Number4() {
        Maximum69Number max = new Maximum69Number();

        int num = 9;
        int expected = 9;

        Assertions.assertEquals(expected, max.maximum69Number(num));
    }

    @Test
    void maximum69Number5() {
        Maximum69Number max = new Maximum69Number();

        int num = 6;
        int expected = 9;

        Assertions.assertEquals(expected, max.maximum69Number(num));
    }

    @Test
    void maximum69Number6() {
        Maximum69Number max = new Maximum69Number();

        int num = 96;
        int expected = 99;

        Assertions.assertEquals(expected, max.maximum69Number(num));
    }

    @Test
    void maximum69Number7() {
        Maximum69Number max = new Maximum69Number();

        int num = 69;
        int expected = 99;

        Assertions.assertEquals(expected, max.maximum69Number(num));
    }
}