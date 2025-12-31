package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTheDigitsThatDivideANumberTest {

    @Test
    void countDigits() {
        CountTheDigitsThatDivideANumber count = new CountTheDigitsThatDivideANumber();

        int num = 7;
        int expected = 1;

        Assertions.assertEquals(expected, count.countDigits(num));
    }

    @Test
    void countDigits2() {
        CountTheDigitsThatDivideANumber count = new CountTheDigitsThatDivideANumber();

        int num = 121;
        int expected = 2;

        Assertions.assertEquals(expected, count.countDigits(num));
    }

    @Test
    void countDigits3() {
        CountTheDigitsThatDivideANumber count = new CountTheDigitsThatDivideANumber();

        int num = 1248;
        int expected = 4;

        Assertions.assertEquals(expected, count.countDigits(num));
    }

    @Test
    void countDigits4() {
        CountTheDigitsThatDivideANumber count = new CountTheDigitsThatDivideANumber();

        int num = 1;
        int expected = 1;

        Assertions.assertEquals(expected, count.countDigits(num));
    }
}