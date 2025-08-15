package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    void findNumbers() {
        FindNumbersWithEvenNumberOfDigits find = new FindNumbersWithEvenNumberOfDigits();

        Assertions.assertEquals(2, find.findNumbers(new int[] {12,345,2,6,7896}));
    }

    @Test
    void findNumbers2() {
        FindNumbersWithEvenNumberOfDigits find = new FindNumbersWithEvenNumberOfDigits();

        Assertions.assertEquals(1, find.findNumbers(new int[] {555,901,482,1771}));
    }

    @Test
    void findNumbers3() {
        FindNumbersWithEvenNumberOfDigits find = new FindNumbersWithEvenNumberOfDigits();

        Assertions.assertEquals(6, find.findNumbers(new int[] {10,99,1000,9999,100000,999999}));
    }

    @Test
    void findNumbers4() {
        FindNumbersWithEvenNumberOfDigits find = new FindNumbersWithEvenNumberOfDigits();

        Assertions.assertEquals(0, find.findNumbers(new int[] {1,9,100,999,10000,99999}));
    }
}