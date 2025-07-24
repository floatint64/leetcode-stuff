package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortVowelsInAStringTest {

    @Test
    void sortVowels() {
        SortVowelsInAString sort = new SortVowelsInAString();

        String s = "lEetcOde";
        String expected = "lEOtcede";

        Assertions.assertEquals(expected, sort.sortVowels(s));
    }

    @Test
    void sortVowels2() {
        SortVowelsInAString sort = new SortVowelsInAString();

        String s = "lYmpH";
        String expected = "lYmpH";

        Assertions.assertEquals(expected, sort.sortVowels(s));
    }

    @Test
    void sortVowels3() {
        SortVowelsInAString sort = new SortVowelsInAString();

        String s = "aA";
        String expected = "Aa";

        Assertions.assertEquals(expected, sort.sortVowels(s));
    }

    @Test
    void sortVowels4() {
        SortVowelsInAString sort = new SortVowelsInAString();

        String s = "Ao";
        String expected = "Ao";

        Assertions.assertEquals(expected, sort.sortVowels(s));
    }

    @Test
    void sortVowels5() {
        SortVowelsInAString sort = new SortVowelsInAString();

        String s = "Tot";
        String expected = "Tot";

        Assertions.assertEquals(expected, sort.sortVowels(s));
    }

    @Test
    void sortVowels6() {
        SortVowelsInAString sort = new SortVowelsInAString();

        String s = "trP";
        String expected = "trP";

        Assertions.assertEquals(expected, sort.sortVowels(s));
    }
}