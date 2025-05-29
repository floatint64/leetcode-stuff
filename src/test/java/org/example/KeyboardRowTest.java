package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardRowTest {

    @Test
    void findWords() {

        KeyboardRow keyboardRow = new KeyboardRow();

        var words = new String[]{"Hello","Alaska","Dad","Peace"};
        var expected = new String[]{"Alaska","Dad"};

        Assertions.assertArrayEquals(expected, keyboardRow.findWords(words));
    }

    @Test
    void findWords2() {

        KeyboardRow keyboardRow = new KeyboardRow();

        var words = new String[]{"omk"};
        var expected = new String[]{};

        Assertions.assertArrayEquals(expected, keyboardRow.findWords(words));
    }

    @Test
    void findWords3() {

        KeyboardRow keyboardRow = new KeyboardRow();

        var words = new String[]{"adsdf","sfd"};
        var expected = new String[]{"adsdf","sfd"};

        Assertions.assertArrayEquals(expected, keyboardRow.findWords(words));
    }
}