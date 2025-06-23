package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestEnglishLetterInUpperAndLowerCaseTest {

    @Test
    void greatestLetter() {
        GreatestEnglishLetterInUpperAndLowerCase great = new GreatestEnglishLetterInUpperAndLowerCase();

        String word = "lEeTcOdE";

        Assertions.assertEquals("E", great.greatestLetter(word));
    }

    @Test
    void greatestLetter2() {
        GreatestEnglishLetterInUpperAndLowerCase great = new GreatestEnglishLetterInUpperAndLowerCase();

        String word = "arRAzFif";

        Assertions.assertEquals("R", great.greatestLetter(word));
    }

    @Test
    void greatestLetter3() {
        GreatestEnglishLetterInUpperAndLowerCase great = new GreatestEnglishLetterInUpperAndLowerCase();

        String word = "AbCdEfGhIjK";

        Assertions.assertEquals("", great.greatestLetter(word));
    }

    @Test
    void greatestLetter4() {
        GreatestEnglishLetterInUpperAndLowerCase great = new GreatestEnglishLetterInUpperAndLowerCase();

        String word = "aAzZ";

        Assertions.assertEquals("Z", great.greatestLetter(word));
    }
}