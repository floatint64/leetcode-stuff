package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

    @Test
    void detectCapitalUse() {
        DetectCapital detectCapital = new DetectCapital();

        String word = "USA";

        Assertions.assertTrue(detectCapital.detectCapitalUse(word));
    }

    @Test
    void detectCapitalUse2() {
        DetectCapital detectCapital = new DetectCapital();

        String word = "FlaG";

        Assertions.assertFalse(detectCapital.detectCapitalUse(word));
    }

    @Test
    void detectCapitalUs3() {
        DetectCapital detectCapital = new DetectCapital();

        String word = "Flag";

        Assertions.assertTrue(detectCapital.detectCapitalUse(word));
    }

    @Test
    void detectCapitalUse4() {
        DetectCapital detectCapital = new DetectCapital();

        String word = "backup";

        Assertions.assertTrue(detectCapital.detectCapitalUse(word));
    }

    @Test
    void detectCapitalUse5() {
        DetectCapital detectCapital = new DetectCapital();

        String word = "bacKup";

        Assertions.assertFalse(detectCapital.detectCapitalUse(word));
    }

    @Test
    void detectCapitalUse6() {
        DetectCapital detectCapital = new DetectCapital();

        String word = "prEsS";

        Assertions.assertFalse(detectCapital.detectCapitalUse(word));
    }

    @Test
    void detectCapitalUse7() {
        DetectCapital detectCapital = new DetectCapital();

        String word = "USa";

        Assertions.assertFalse(detectCapital.detectCapitalUse(word));
    }
}