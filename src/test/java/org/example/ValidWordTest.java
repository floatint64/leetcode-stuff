package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidWordTest {

    @Test
    void isValid() {
        ValidWord valid = new ValidWord();

        String word = "234Adas";

        Assertions.assertTrue(valid.isValid(word));
    }

    @Test
    void isValid2() {
        ValidWord valid = new ValidWord();

        String word = "b3";

        Assertions.assertFalse(valid.isValid(word));
    }

    @Test
    void isValid3() {
        ValidWord valid = new ValidWord();

        String word = "a3$e";

        Assertions.assertFalse(valid.isValid(word));
    }

    @Test
    void isValid4() {
        ValidWord valid = new ValidWord();

        String word = "BBCCDD";

        Assertions.assertFalse(valid.isValid(word));
    }

    @Test
    void isValid5() {
        ValidWord valid = new ValidWord();

        String word = "Ab3!";

        Assertions.assertFalse(valid.isValid(word));
    }
}