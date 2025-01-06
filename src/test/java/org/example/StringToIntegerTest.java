package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    void myAtoi() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "42";

        Assertions.assertEquals(42, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi2() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "-42";

        Assertions.assertEquals(-42, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi3() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "-042";

        Assertions.assertEquals(-42, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi4() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "1337c0d3";

        Assertions.assertEquals(1337, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi5() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "0-1";

        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi6() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "words and 987";

        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi7() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "   ";

        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi8() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "w   ";

        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi9() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "A";

        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi10() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "999999999999999";

        Assertions.assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi11() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "-999999999999999";

        Assertions.assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi12() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = Integer.toString(Integer.MAX_VALUE);

        Assertions.assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi13() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = Integer.toString(Integer.MIN_VALUE);

        Assertions.assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi14() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = Integer.toString(Integer.MAX_VALUE + 1);

        Assertions.assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi15() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = Integer.toString(Integer.MIN_VALUE - 1);

        Assertions.assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi16() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "1000 1000 1000";

        Assertions.assertEquals(1000, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi17() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "-91283472332";

        Assertions.assertEquals(-2147483648, stringToInteger.myAtoi(s));
    }

    @Test
    void myAtoi18() {
        StringToInteger stringToInteger = new StringToInteger();

        String s = "  -0012a42";

        Assertions.assertEquals(-12, stringToInteger.myAtoi(s));
    }
}