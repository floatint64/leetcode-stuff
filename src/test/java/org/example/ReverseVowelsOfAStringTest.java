package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfAStringTest {

    @Test
    void reverseVowels() {
        ReverseVowelsOfAString rev = new ReverseVowelsOfAString();

        String s = "IceCreAm";
        String expected = "AceCreIm";

        Assertions.assertEquals(expected, rev.reverseVowels(s));
    }

    @Test
    void reverseVowels2() {
        ReverseVowelsOfAString rev = new ReverseVowelsOfAString();

        String s = "leetcode";
        String expected = "leotcede";

        Assertions.assertEquals(expected, rev.reverseVowels(s));
    }

    @Test
    void reverseVowels3() {
        ReverseVowelsOfAString rev = new ReverseVowelsOfAString();

        String s = "r";
        String expected = "r";

        Assertions.assertEquals(expected, rev.reverseVowels(s));
    }

    @Test
    void reverseVowels4() {
        ReverseVowelsOfAString rev = new ReverseVowelsOfAString();

        String s = "a";
        String expected = "a";

        Assertions.assertEquals(expected, rev.reverseVowels(s));
    }

    @Test
    void reverseVowels5() {
        ReverseVowelsOfAString rev = new ReverseVowelsOfAString();

        String s = "Ai";
        String expected = "iA";

        Assertions.assertEquals(expected, rev.reverseVowels(s));
    }
}