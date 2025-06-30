package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaultyKeyboardTest {

    @Test
    void finalString() {
        FaultyKeyboard faultyKeyboard = new FaultyKeyboard();

        String s = "string";
        String expected = "rtsng";

        Assertions.assertEquals(expected, faultyKeyboard.finalString(s));
    }

    @Test
    void finalString2() {
        FaultyKeyboard faultyKeyboard = new FaultyKeyboard();

        String s = "poiinter";
        String expected = "ponter";

        Assertions.assertEquals(expected, faultyKeyboard.finalString(s));
    }

    @Test
    void finalString3() {
        FaultyKeyboard faultyKeyboard = new FaultyKeyboard();

        String s = "iii";
        String expected = "";

        Assertions.assertEquals(expected, faultyKeyboard.finalString(s));
    }

    @Test
    void finalString4() {
        FaultyKeyboard faultyKeyboard = new FaultyKeyboard();

        String s = "stiiii";
        String expected = "st";

        Assertions.assertEquals(expected, faultyKeyboard.finalString(s));
    }
}