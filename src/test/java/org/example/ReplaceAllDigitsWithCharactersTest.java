package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceAllDigitsWithCharactersTest {

    @Test
    void replaceDigits() {
        ReplaceAllDigitsWithCharacters rep = new ReplaceAllDigitsWithCharacters();

        String s = "a1c1e1";
        String expected = "abcdef";

        Assertions.assertEquals(expected, rep.replaceDigits(s));
    }

    @Test
    void replaceDigits2() {
        ReplaceAllDigitsWithCharacters rep = new ReplaceAllDigitsWithCharacters();

        String s = "a1b2c3d4e";
        String expected = "abbdcfdhe";

        Assertions.assertEquals(expected, rep.replaceDigits(s));
    }

    @Test
    void replaceDigits3() {
        ReplaceAllDigitsWithCharacters rep = new ReplaceAllDigitsWithCharacters();

        String s = "a";
        String expected = "a";

        Assertions.assertEquals(expected, rep.replaceDigits(s));
    }

    @Test
    void replaceDigits4() {
        ReplaceAllDigitsWithCharacters rep = new ReplaceAllDigitsWithCharacters();

        String s = "1";
        String expected = "1";

        Assertions.assertEquals(expected, rep.replaceDigits(s));
    }
}