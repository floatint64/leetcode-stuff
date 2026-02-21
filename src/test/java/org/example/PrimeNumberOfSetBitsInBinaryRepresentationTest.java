package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberOfSetBitsInBinaryRepresentationTest {

    @Test
    void countPrimeSetBits() {
        PrimeNumberOfSetBitsInBinaryRepresentation p = new PrimeNumberOfSetBitsInBinaryRepresentation();

        int left = 6;
        int right = 10;

        int expected = 4;

        Assertions.assertEquals(expected, p.countPrimeSetBits(left, right));
    }

    @Test
    void countPrimeSetBits2() {
        PrimeNumberOfSetBitsInBinaryRepresentation p = new PrimeNumberOfSetBitsInBinaryRepresentation();

        int left = 10;
        int right = 15;

        int expected = 5;

        Assertions.assertEquals(expected, p.countPrimeSetBits(left, right));
    }

    @Test
    void countPrimeSetBits3() {
        PrimeNumberOfSetBitsInBinaryRepresentation p = new PrimeNumberOfSetBitsInBinaryRepresentation();

        int left = 1;
        int right = 1;

        int expected = 0;

        Assertions.assertEquals(expected, p.countPrimeSetBits(left, right));
    }
}