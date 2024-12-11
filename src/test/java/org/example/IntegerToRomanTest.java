package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void intToRoman() {
        IntegerToRoman integerToRoman = new IntegerToRoman();

        Assertions.assertEquals("MMMDCCXLIX", integerToRoman.intToRoman(3749));
    }

    @Test
    void intToRoman2() {
        IntegerToRoman integerToRoman = new IntegerToRoman();

        Assertions.assertEquals("LVIII", integerToRoman.intToRoman(58));
    }

    @Test
    void intToRoman3() {
        IntegerToRoman integerToRoman = new IntegerToRoman();

        Assertions.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }
}