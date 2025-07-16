package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSymmetricIntegersTest {

    @Test
    void countSymmetricIntegers() {
        CountSymmetricIntegers count = new CountSymmetricIntegers();

        Assertions.assertEquals(9, count.countSymmetricIntegers(1, 100));
    }

    @Test
    void countSymmetricIntegers2() {
        CountSymmetricIntegers count = new CountSymmetricIntegers();

        Assertions.assertEquals(4, count.countSymmetricIntegers(1200, 1230));
    }

    @Test
    void countSymmetricIntegers3() {
        CountSymmetricIntegers count = new CountSymmetricIntegers();

        Assertions.assertEquals(0, count.countSymmetricIntegers(1, 9));
    }

    @Test
    void countSymmetricIntegers4() {
        CountSymmetricIntegers count = new CountSymmetricIntegers();

        Assertions.assertEquals(0, count.countSymmetricIntegers(100, 999));
    }
}