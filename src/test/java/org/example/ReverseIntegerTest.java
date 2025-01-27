package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();

        Assertions.assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    void reverse1() {
        ReverseInteger reverseInteger = new ReverseInteger();

        Assertions.assertEquals(-321, reverseInteger.reverse(-123));
    }

    @Test
    void reverse2() {
        ReverseInteger reverseInteger = new ReverseInteger();

        Assertions.assertEquals(21, reverseInteger.reverse(120));
    }

    @Test
    void reverse3() {
        ReverseInteger reverseInteger = new ReverseInteger();

        // 2,147,483,647
        Assertions.assertEquals(0, reverseInteger.reverse(Integer.MAX_VALUE));
    }
}