package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerReplacementTest {

    @Test
    void integerReplacement() {
        IntegerReplacement replacement = new IntegerReplacement();

        int n = 7;

        Assertions.assertEquals(4, replacement.integerReplacement(n));
    }

    @Test
    void integerReplacement2() {
        IntegerReplacement replacement = new IntegerReplacement();

        int n = 8;

        Assertions.assertEquals(3, replacement.integerReplacement(n));
    }

    @Test
    void integerReplacement3() {
        IntegerReplacement replacement = new IntegerReplacement();

        int n = 4;

        Assertions.assertEquals(2, replacement.integerReplacement(n));
    }

    @Test
    void integerReplacement4() {
        IntegerReplacement replacement = new IntegerReplacement();

        int n = 1234;

        Assertions.assertEquals(14, replacement.integerReplacement(n));
    }

    @Test
    void integerReplacement5() {
        IntegerReplacement replacement = new IntegerReplacement();

        int n = 3;

        Assertions.assertEquals(2, replacement.integerReplacement(n));
    }
}