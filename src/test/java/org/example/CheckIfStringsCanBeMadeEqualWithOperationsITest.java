package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfStringsCanBeMadeEqualWithOperationsITest {

    @Test
    void canBeEqual() {
        CheckIfStringsCanBeMadeEqualWithOperationsI check = new CheckIfStringsCanBeMadeEqualWithOperationsI();

        String s1 = "abcd";
        String s2 = "cdab";

        Assertions.assertTrue(check.canBeEqual(s1, s2));
    }

    @Test
    void canBeEqual2() {
        CheckIfStringsCanBeMadeEqualWithOperationsI check = new CheckIfStringsCanBeMadeEqualWithOperationsI();

        String s1 = "abcd";
        String s2 = "dacb";

        Assertions.assertFalse(check.canBeEqual(s1, s2));
    }

    @Test
    void canBeEqual3() {
        CheckIfStringsCanBeMadeEqualWithOperationsI check = new CheckIfStringsCanBeMadeEqualWithOperationsI();

        String s1 = "aaaa";
        String s2 = "aaaa";

        Assertions.assertTrue(check.canBeEqual(s1, s2));
    }

    @Test
    void canBeEqual4() {
        CheckIfStringsCanBeMadeEqualWithOperationsI check = new CheckIfStringsCanBeMadeEqualWithOperationsI();

        String s1 = "aaab";
        String s2 = "baaa";

        Assertions.assertFalse(check.canBeEqual(s1, s2));
    }

    @Test
    void canBeEqual5() {
        CheckIfStringsCanBeMadeEqualWithOperationsI check = new CheckIfStringsCanBeMadeEqualWithOperationsI();

        String s1 = "bnxw";
        String s2 = "bwxn";

        Assertions.assertTrue(check.canBeEqual(s1, s2));
    }
}