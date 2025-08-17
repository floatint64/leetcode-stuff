package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {

    @Test
    void hammingWeight() {
        NumberOf1Bits number = new NumberOf1Bits();

        Assertions.assertEquals(1, number.hammingWeight(1));
    }

    @Test
    void hammingWeight2() {
        NumberOf1Bits number = new NumberOf1Bits();

        Assertions.assertEquals(3, number.hammingWeight(11));
    }

    @Test
    void hammingWeight3() {
        NumberOf1Bits number = new NumberOf1Bits();

        Assertions.assertEquals(1, number.hammingWeight(128));
    }

    @Test
    void hammingWeight4() {
        NumberOf1Bits number = new NumberOf1Bits();

        Assertions.assertEquals(30, number.hammingWeight(2147483645));
    }

    @Test
    void hammingWeight5() {
        NumberOf1Bits number = new NumberOf1Bits();

        Assertions.assertEquals(1, number.hammingWeight(256));
    }

    @Test
    void hammingWeight6() {
        NumberOf1Bits number = new NumberOf1Bits();

        Assertions.assertEquals(0, number.hammingWeight(0));
    }
}