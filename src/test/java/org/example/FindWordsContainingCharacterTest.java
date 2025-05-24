package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindWordsContainingCharacterTest {

    @Test
    void findWordsContaining() {

        FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();

        var words = new String[]{"leet", "code"};

        var expected = List.of(0, 1);

        var x = 'e';

        Assertions.assertEquals(expected, findWordsContainingCharacter.findWordsContaining(words, x));
    }

    @Test
    void findWordsContaining2() {

        FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();

        var words = new String[]{"abc","bcd","aaaa","cbc"};

        var expected = List.of(0, 2);

        var x = 'a';

        Assertions.assertEquals(expected, findWordsContainingCharacter.findWordsContaining(words, x));
    }

    @Test
    void findWordsContaining3() {

        FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();

        var words = new String[]{"abc","bcd","aaaa","cbc"};

        var expected = List.of();

        var x = 'z';

        Assertions.assertEquals(expected, findWordsContainingCharacter.findWordsContaining(words, x));
    }

    @Test
    void findWordsContaining4() {

        FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();

        var words = new String[]{"a","aa","aaa","aaaa"};

        var expected = List.of(0, 1, 2, 3);

        var x = 'a';

        Assertions.assertEquals(expected, findWordsContainingCharacter.findWordsContaining(words, x));
    }
}