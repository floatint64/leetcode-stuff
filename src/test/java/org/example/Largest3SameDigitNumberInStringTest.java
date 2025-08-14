package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Largest3SameDigitNumberInStringTest {

    @Test
    void largestGoodInteger() {
        Largest3SameDigitNumberInString large = new Largest3SameDigitNumberInString();

        String num = "6777133339";
        String expected = "777";

        Assertions.assertEquals(expected, large.largestGoodInteger(num));
    }

    @Test
    void largestGoodInteger2() {
        Largest3SameDigitNumberInString large = new Largest3SameDigitNumberInString();

        String num = "2300019";
        String expected = "000";

        Assertions.assertEquals(expected, large.largestGoodInteger(num));
    }

    @Test
    void largestGoodInteger3() {
        Largest3SameDigitNumberInString large = new Largest3SameDigitNumberInString();

        String num = "42352338";
        String expected = "";

        Assertions.assertEquals(expected, large.largestGoodInteger(num));
    }

    @Test
    void largestGoodInteger4() {
        Largest3SameDigitNumberInString large = new Largest3SameDigitNumberInString();

        String num = "230001947623762111";
        String expected = "111";

        Assertions.assertEquals(expected, large.largestGoodInteger(num));
    }
}