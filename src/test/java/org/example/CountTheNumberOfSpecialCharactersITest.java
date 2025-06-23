package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTheNumberOfSpecialCharactersITest {

    @Test
    void numberOfSpecialChars() {
        CountTheNumberOfSpecialCharactersI count = new CountTheNumberOfSpecialCharactersI();

        String word = "aaAbcBC";

        Assertions.assertEquals(3, count.numberOfSpecialChars(word));
    }

    @Test
    void numberOfSpecialChars2() {
        CountTheNumberOfSpecialCharactersI count = new CountTheNumberOfSpecialCharactersI();

        String word = "abc";

        Assertions.assertEquals(0, count.numberOfSpecialChars(word));
    }

    @Test
    void numberOfSpecialChars3() {
        CountTheNumberOfSpecialCharactersI count = new CountTheNumberOfSpecialCharactersI();

        String word = "abBCab";

        Assertions.assertEquals(1, count.numberOfSpecialChars(word));
    }
}