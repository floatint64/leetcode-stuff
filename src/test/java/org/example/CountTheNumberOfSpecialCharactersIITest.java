package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTheNumberOfSpecialCharactersIITest {

    @Test
    void numberOfSpecialChars() {
        CountTheNumberOfSpecialCharactersII count = new CountTheNumberOfSpecialCharactersII();

        String word = "aaAbcBC";

        Assertions.assertEquals(3, count.numberOfSpecialChars(word));
    }

    @Test
    void numberOfSpecialChars2() {
        CountTheNumberOfSpecialCharactersII count = new CountTheNumberOfSpecialCharactersII();

        String word = "abc";

        Assertions.assertEquals(0, count.numberOfSpecialChars(word));
    }

    @Test
    void numberOfSpecialChars3() {
        CountTheNumberOfSpecialCharactersII count = new CountTheNumberOfSpecialCharactersII();

        String word = "AbBCab";

        Assertions.assertEquals(0, count.numberOfSpecialChars(word));
    }

    @Test
    void numberOfSpecialChars4() {
        CountTheNumberOfSpecialCharactersII count = new CountTheNumberOfSpecialCharactersII();

        String word = "azZbkAl";

        Assertions.assertEquals(2, count.numberOfSpecialChars(word));
    }

    @Test
    void numberOfSpecialChars5() {
        CountTheNumberOfSpecialCharactersII count = new CountTheNumberOfSpecialCharactersII();

        String word = "a";

        Assertions.assertEquals(0, count.numberOfSpecialChars(word));
    }

    @Test
    void numberOfSpecialChars6() {
        CountTheNumberOfSpecialCharactersII count = new CountTheNumberOfSpecialCharactersII();

        String word = "A";

        Assertions.assertEquals(0, count.numberOfSpecialChars(word));
    }
}