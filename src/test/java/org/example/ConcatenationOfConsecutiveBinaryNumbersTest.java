package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfConsecutiveBinaryNumbersTest {

    @Test
    void concatenatedBinary() {
        ConcatenationOfConsecutiveBinaryNumbers c = new ConcatenationOfConsecutiveBinaryNumbers();

        int n = 1;
        int expected = 1;

        Assertions.assertEquals(expected, c.concatenatedBinary(n));
    }

    @Test
    void concatenatedBinary2() {
        ConcatenationOfConsecutiveBinaryNumbers c = new ConcatenationOfConsecutiveBinaryNumbers();

        int n = 3;
        int expected = 27;

        Assertions.assertEquals(expected, c.concatenatedBinary(n));
    }

    @Test
    void concatenatedBinary3() {
        ConcatenationOfConsecutiveBinaryNumbers c = new ConcatenationOfConsecutiveBinaryNumbers();

        int n = 12;
        int expected = 505379714;

        Assertions.assertEquals(expected, c.concatenatedBinary(n));
    }
}