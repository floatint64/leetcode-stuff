package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNumberHasEqualDigitCountAndDigitValueTest {

    @Test
    void digitCount() {
        CheckIfNumberHasEqualDigitCountAndDigitValue check = new CheckIfNumberHasEqualDigitCountAndDigitValue();

        String num = "1210";

        Assertions.assertTrue(check.digitCount(num));
    }

    @Test
    void digitCount2() {
        CheckIfNumberHasEqualDigitCountAndDigitValue check = new CheckIfNumberHasEqualDigitCountAndDigitValue();

        String num = "030";

        Assertions.assertFalse(check.digitCount(num));
    }
}