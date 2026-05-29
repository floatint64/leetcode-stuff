package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsOfStringAfterConvertTest {

    @Test
    void getLucky() {
        SumOfDigitsOfStringAfterConvert sum = new SumOfDigitsOfStringAfterConvert();

        String s = "iiii";
        int k = 1;
        int expected = 36;

        Assertions.assertEquals(expected, sum.getLucky(s, k));
    }

    @Test
    void getLucky2() {
        SumOfDigitsOfStringAfterConvert sum = new SumOfDigitsOfStringAfterConvert();

        String s = "leetcode";
        int k = 2;
        int expected = 6;

        Assertions.assertEquals(expected, sum.getLucky(s, k));
    }

    @Test
    void getLucky3() {
        SumOfDigitsOfStringAfterConvert sum = new SumOfDigitsOfStringAfterConvert();

        String s = "zbax";
        int k = 2;
        int expected = 8;

        Assertions.assertEquals(expected, sum.getLucky(s, k));
    }

    @Test
    void getLucky4() {
        SumOfDigitsOfStringAfterConvert sum = new SumOfDigitsOfStringAfterConvert();

        String s = "dbvmfhnttvr";
        int k = 5;
        int expected = 5;

        Assertions.assertEquals(expected, sum.getLucky(s, k));
    }

    @Test
    void getLucky5() {
        SumOfDigitsOfStringAfterConvert sum = new SumOfDigitsOfStringAfterConvert();

        String s = "hvmhoasabaymnmsd";
        int k = 1;
        int expected = 79;

        Assertions.assertEquals(expected, sum.getLucky(s, k));
    }
}