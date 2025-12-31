package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindCommonCharactersTest {

    @Test
    void commonChars() {
        FindCommonCharacters find = new FindCommonCharacters();

        String[] words = {"bella","label","roller"};
        var expected = List.of("e","l","l");

        Assertions.assertEquals(expected, find.commonChars(words));
    }

    @Test
    void commonChars2() {
        FindCommonCharacters find = new FindCommonCharacters();

        String[] words = {"cool","lock","cook"};
        var expected = List.of("c","o");

        Assertions.assertEquals(expected, find.commonChars(words));
    }

    @Test
    void commonChars3() {
        FindCommonCharacters find = new FindCommonCharacters();

        String[] words = {"aaa","aaa","a"};
        var expected = List.of("a");

        Assertions.assertEquals(expected, find.commonChars(words));
    }

    @Test
    void commonChars4() {
        FindCommonCharacters find = new FindCommonCharacters();

        String[] words = {"zzzzzz","z","z"};
        var expected = List.of("z");

        Assertions.assertEquals(expected, find.commonChars(words));
    }

    @Test
    void commonChars5() {
        FindCommonCharacters find = new FindCommonCharacters();

        String[] words = {"z","z","z"};
        var expected = List.of("z");

        Assertions.assertEquals(expected, find.commonChars(words));
    }
}