package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "Hello world";

        Assertions.assertEquals(5, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord2() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "  Hello   world  ";

        Assertions.assertEquals(5, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord3() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "world";

        Assertions.assertEquals(5, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord4() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "   world   ";

        Assertions.assertEquals(5, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord5() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "   wor ld   ";

        Assertions.assertEquals(2, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord6() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "   fly me   to   the moon  ";

        Assertions.assertEquals(4, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord7() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = "luffy is still joyboy";

        Assertions.assertEquals(6, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord8() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        String s = " ";

        Assertions.assertEquals(0, lengthOfLastWord.lengthOfLastWord(s));
    }
}