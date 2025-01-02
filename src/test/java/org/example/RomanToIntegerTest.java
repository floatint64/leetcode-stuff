package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "III";

        Assertions.assertEquals(3, romanToInteger.romanToInt(romanNum));
    }

    @Test
    void romanToInt2() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "LVIII";

        Assertions.assertEquals(58, romanToInteger.romanToInt(romanNum));
    }

    @Test
    void romanToInt3() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "MCMXCIV";

        Assertions.assertEquals(1994, romanToInteger.romanToInt(romanNum));
    }

    @Test
    void romanToInt4() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "XLIX";

        Assertions.assertEquals(49, romanToInteger.romanToInt(romanNum));
    }

    @Test
    void romanToInt5() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "IX";

        Assertions.assertEquals(9, romanToInteger.romanToInt(romanNum));
    }

    @Test
    void romanToInt6() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "XL";

        Assertions.assertEquals(40, romanToInteger.romanToInt(romanNum));
    }

    @Test
    void romanToInt7() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "MCMIV";

        Assertions.assertEquals(1904, romanToInteger.romanToInt(romanNum));
    }

    @Test
    void romanToInt8() {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNum = "MCDLXXVI";

        Assertions.assertEquals(1476, romanToInteger.romanToInt(romanNum));
    }
}