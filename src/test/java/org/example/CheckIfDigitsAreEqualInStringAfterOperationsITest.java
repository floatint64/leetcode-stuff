package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfDigitsAreEqualInStringAfterOperationsITest {

    @Test
    void hasSameDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI check = new CheckIfDigitsAreEqualInStringAfterOperationsI();

        String s = "3902";

        Assertions.assertTrue(check.hasSameDigits(s));
    }

    @Test
    void hasSameDigits2() {
        CheckIfDigitsAreEqualInStringAfterOperationsI check = new CheckIfDigitsAreEqualInStringAfterOperationsI();

        String s = "34789";

        Assertions.assertFalse(check.hasSameDigits(s));
    }

    @Test
    void hasSameDigits3() {
        CheckIfDigitsAreEqualInStringAfterOperationsI check = new CheckIfDigitsAreEqualInStringAfterOperationsI();

        String s = "333";

        Assertions.assertTrue(check.hasSameDigits(s));
    }
}