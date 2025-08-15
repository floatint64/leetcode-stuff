package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {

    @Test
    void isPowerOfFour() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertTrue(power.isPowerOfFour(4));
    }

    @Test
    void isPowerOfFour2() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertTrue(power.isPowerOfFour(64));
    }

    @Test
    void isPowerOfFour3() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertFalse(power.isPowerOfFour(32));
    }

    @Test
    void isPowerOfFour4() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertFalse(power.isPowerOfFour(0));
    }

    @Test
    void isPowerOfFour5() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertFalse(power.isPowerOfFour(Integer.MAX_VALUE));
    }

    @Test
    void isPowerOfFour6() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertFalse(power.isPowerOfFour(Integer.MIN_VALUE));
    }

    @Test
    void isPowerOfFour7() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertTrue(power.isPowerOfFour(1));
    }

    @Test
    void isPowerOfFour8() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertFalse(power.isPowerOfFour(3));
    }

    @Test
    void isPowerOfFour9() {
        PowerOfFour power = new PowerOfFour();

        Assertions.assertTrue(power.isPowerOfFour(1073741824));
    }
}