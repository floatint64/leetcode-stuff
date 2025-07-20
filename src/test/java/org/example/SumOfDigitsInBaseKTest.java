package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsInBaseKTest {

    @Test
    void sumBase() {
        SumOfDigitsInBaseK sum = new SumOfDigitsInBaseK();

        Assertions.assertEquals(9, sum.sumBase(34, 6));
    }

    @Test
    void sumBase2() {
        SumOfDigitsInBaseK sum = new SumOfDigitsInBaseK();

        Assertions.assertEquals(1, sum.sumBase(10, 10));
    }

    @Test
    void sumBase3() {
        SumOfDigitsInBaseK sum = new SumOfDigitsInBaseK();

        Assertions.assertEquals(5, sum.sumBase(55, 2));
    }
}