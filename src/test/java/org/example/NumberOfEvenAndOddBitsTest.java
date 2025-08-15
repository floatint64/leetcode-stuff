package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfEvenAndOddBitsTest {

    @Test
    void evenOddBit() {
        NumberOfEvenAndOddBits number = new NumberOfEvenAndOddBits();

        Assertions.assertArrayEquals(new int[] {1, 2}, number.evenOddBit(50));
    }

    @Test
    void evenOddBit2() {
        NumberOfEvenAndOddBits number = new NumberOfEvenAndOddBits();

        Assertions.assertArrayEquals(new int[] {0, 1}, number.evenOddBit(2));
    }
}