package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UTF8ValidationTest {

    @Test
    void validUtf8() {
        UTF8Validation utf8Validation = new UTF8Validation();

        int[] data = {197, 130, 1};

        Assertions.assertTrue(utf8Validation.validUtf8(data));
    }

    @Test
    void validUtf82() {
        UTF8Validation utf8Validation = new UTF8Validation();

        int[] data = {235,140,4};

        Assertions.assertFalse(utf8Validation.validUtf8(data));
    }

    @Test
    void validUtf83() {
        UTF8Validation utf8Validation = new UTF8Validation();

        int[] data = {255};

        Assertions.assertFalse(utf8Validation.validUtf8(data));
    }
}