package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {

    @Test
    void reverseBits() {
        ReverseBits r = new ReverseBits();
        int n = 43261596;
        int expected = 964176192;

        Assertions.assertEquals(expected, r.reverseBits(n));
    }

    @Test
    void reverseBits2() {
        ReverseBits r = new ReverseBits();
        int n = 2147483644;
        int expected = 1073741822;

        Assertions.assertEquals(expected, r.reverseBits(n));
    }

    @Test
    void reverseBits3() {
        ReverseBits r = new ReverseBits();
        int n = 1;
        int expected = -2147483648;

        Assertions.assertEquals(expected, r.reverseBits(n));
    }

    @Test
    void reverseBits4() {
        ReverseBits r = new ReverseBits();
        int n = 0;
        int expected = 0;

        Assertions.assertEquals(expected, r.reverseBits(n));
    }
}