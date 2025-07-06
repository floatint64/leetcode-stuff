package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubstringsWithOnly1sTest {

    @Test
    void numSub() {
        NumberOfSubstringsWithOnly1s num = new NumberOfSubstringsWithOnly1s();

        String s = "0110111";

        Assertions.assertEquals(9, num.numSub(s));
    }

    @Test
    void numSub2() {
        NumberOfSubstringsWithOnly1s num = new NumberOfSubstringsWithOnly1s();

        String s = "101";

        Assertions.assertEquals(2, num.numSub(s));
    }

    @Test
    void numSub3() {
        NumberOfSubstringsWithOnly1s num = new NumberOfSubstringsWithOnly1s();

        String s = "111111";

        Assertions.assertEquals(21, num.numSub(s));
    }

    @Test
    void numSub4() {
        NumberOfSubstringsWithOnly1s num = new NumberOfSubstringsWithOnly1s();

        String s = "1111";

        Assertions.assertEquals(10, num.numSub(s));
    }

    @Test
    void numSub5() {
        NumberOfSubstringsWithOnly1s num = new NumberOfSubstringsWithOnly1s();

        String s = "00000";

        Assertions.assertEquals(0, num.numSub(s));
    }

    @Test
    void numSub6() {
        NumberOfSubstringsWithOnly1s num = new NumberOfSubstringsWithOnly1s();

        String s = "0";

        Assertions.assertEquals(0, num.numSub(s));
    }

    @Test
    void numSub7() {
        NumberOfSubstringsWithOnly1s num = new NumberOfSubstringsWithOnly1s();

        String s = "1";

        Assertions.assertEquals(1, num.numSub(s));
    }
}