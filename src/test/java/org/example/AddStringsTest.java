package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringsTest {

    @Test
    void addStrings() {
        AddStrings addStrings = new AddStrings();

        String num1 = "11";
        String num2 = "123";
        String expected = "134";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings2() {
        AddStrings addStrings = new AddStrings();

        String num1 = "456";
        String num2 = "77";
        String expected = "533";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings3() {
        AddStrings addStrings = new AddStrings();

        String num1 = "0";
        String num2 = "0";
        String expected = "0";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings4() {
        AddStrings addStrings = new AddStrings();

        String num1 = "9999";
        String num2 = "1";
        String expected = "10000";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings5() {
        AddStrings addStrings = new AddStrings();

        String num1 = "1";
        String num2 = "9999";
        String expected = "10000";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings6() {
        AddStrings addStrings = new AddStrings();

        String num1 = "1999";
        String num2 = "1";
        String expected = "2000";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings7() {
        AddStrings addStrings = new AddStrings();

        String num1 = "1";
        String num2 = "1999";
        String expected = "2000";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings8() {
        AddStrings addStrings = new AddStrings();

        String num1 = "1111";
        String num2 = "9999";
        String expected = "11110";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }

    @Test
    void addStrings9() {
        AddStrings addStrings = new AddStrings();

        String num1 = "9";
        String num2 = "9";
        String expected = "18";

        Assertions.assertEquals(expected, addStrings.addStrings(num1, num2));
    }
}