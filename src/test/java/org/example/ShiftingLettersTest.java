package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftingLettersTest {

    @Test
    void shiftingLetters() {
        ShiftingLetters shiftingLetters = new ShiftingLetters();

        String s = "abc";
        int[] shifts = {3,5,9};

        Assertions.assertEquals("rpl", shiftingLetters.shiftingLetters(s, shifts));
    }

    @Test
    void shiftingLetters2() {
        ShiftingLetters shiftingLetters = new ShiftingLetters();

        String s = "aaa";
        int[] shifts = {1,2,3};

        Assertions.assertEquals("gfd", shiftingLetters.shiftingLetters(s, shifts));
    }

    @Test
    void shiftingLetters3() {
        ShiftingLetters shiftingLetters = new ShiftingLetters();

        String s = "a";
        int[] shifts = {0};

        Assertions.assertEquals("a", shiftingLetters.shiftingLetters(s, shifts));
    }

    @Test
    void shiftingLetters4() {
        ShiftingLetters shiftingLetters = new ShiftingLetters();

        String s = "mkgfzkkuxownxvfvxasy";
        int[] shifts = {505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};

        Assertions.assertEquals("wqqwlcjnkphhsyvrkdod", shiftingLetters.shiftingLetters(s, shifts));
    }
}