package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void wordPattern() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "aaaa";
        String s = "dog coc leg work";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern2() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "abba";
        String s = "dog cat cat dog";

        Assertions.assertTrue(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern3() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "abba";
        String s = "dog cat cat fish";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern4() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "aaaa";
        String s = "dog cat cat dog";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern5() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "aa";
        String s = "dog dog cat";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern6() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "aa";
        String s = "dog cat";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern7() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "aaaa";
        String s = "dog dog";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern8() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "abcd";
        String s = "dog cat tet pec";

        Assertions.assertTrue(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern9() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "abcda";
        String s = "dog cat tet pec dog";

        Assertions.assertTrue(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern10() {
        WordPattern wordPattern = new WordPattern();

        String pattern = "abcde";
        String s = "dog cat tet pec dog";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }
}