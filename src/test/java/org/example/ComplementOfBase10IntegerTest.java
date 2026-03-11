package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplementOfBase10IntegerTest {

    @Test
    void bitwiseComplement() {
        ComplementOfBase10Integer c = new ComplementOfBase10Integer();

        int n = 5;
        int expected = 2;

        Assertions.assertEquals(expected, c.bitwiseComplement(n));
    }

    @Test
    void bitwiseComplement2() {
        ComplementOfBase10Integer c = new ComplementOfBase10Integer();

        int n = 7;
        int expected = 0;

        Assertions.assertEquals(expected, c.bitwiseComplement(n));
    }

    @Test
    void bitwiseComplement3() {
        ComplementOfBase10Integer c = new ComplementOfBase10Integer();

        int n = 10;
        int expected = 5;

        Assertions.assertEquals(expected, c.bitwiseComplement(n));
    }

    @Test
    void bitwiseComplement4() {
        ComplementOfBase10Integer c = new ComplementOfBase10Integer();

        int n = 0;
        int expected = 1;

        Assertions.assertEquals(expected, c.bitwiseComplement(n));
    }

    @Test
    void bitwiseComplement5() {
        ComplementOfBase10Integer c = new ComplementOfBase10Integer();

        int n = 1000000000;
        int expected = 73741823;

        Assertions.assertEquals(expected, c.bitwiseComplement(n));
    }
}