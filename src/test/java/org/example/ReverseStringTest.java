package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString rev = new ReverseString();

        char[] s = "hello".toCharArray();
        char[] expected = "olleh".toCharArray();

        rev.reverseString(s);
        Assertions.assertArrayEquals(expected, s);
    }

    @Test
    void reverseString2() {
        ReverseString rev = new ReverseString();

        char[] s = "h".toCharArray();
        char[] expected = "h".toCharArray();

        rev.reverseString(s);
        Assertions.assertArrayEquals(expected, s);
    }
}