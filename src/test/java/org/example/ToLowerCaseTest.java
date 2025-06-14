package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerCaseTest {

    @Test
    void toLowerCase() {
        ToLowerCase low = new ToLowerCase();

        String s = "HELLO";

        Assertions.assertEquals("hello", low.toLowerCase(s));
    }

    @Test
    void toLowerCase2() {
        ToLowerCase low = new ToLowerCase();

        String s = "HELLO WoRlD";

        Assertions.assertEquals("hello world", low.toLowerCase(s));
    }

    @Test
    void toLowerCase3() {
        ToLowerCase low = new ToLowerCase();

        String s = "hello ";

        Assertions.assertEquals("hello ", low.toLowerCase(s));
    }

    @Test
    void toLowerCase4() {
        ToLowerCase low = new ToLowerCase();

        String s = "AZaz";

        Assertions.assertEquals("azaz", low.toLowerCase(s));
    }

    @Test
    void toLowerCase5() {
        ToLowerCase low = new ToLowerCase();

        String s = "123456789/,.<>[]{}!@#$%^&*()-_+=";

        Assertions.assertEquals("123456789/,.<>[]{}!@#$%^&*()-_+=", low.toLowerCase(s));
    }
}