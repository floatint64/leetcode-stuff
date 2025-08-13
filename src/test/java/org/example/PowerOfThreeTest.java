package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    @Test
    void isPowerOfThree() {
        PowerOfThree power = new PowerOfThree();

        Assertions.assertTrue(power.isPowerOfThree(1));
    }

    @Test
    void isPowerOfThree2() {
        PowerOfThree power = new PowerOfThree();

        Assertions.assertTrue(power.isPowerOfThree(3));
    }

    @Test
    void isPowerOfThree3() {
        PowerOfThree power = new PowerOfThree();

        Assertions.assertTrue(power.isPowerOfThree(9));
    }

    @Test
    void isPowerOfThree4() {
        PowerOfThree power = new PowerOfThree();

        Assertions.assertTrue(power.isPowerOfThree(81));
    }

    @Test
    void isPowerOfThree5() {
        PowerOfThree power = new PowerOfThree();

        Assertions.assertFalse(power.isPowerOfThree(2));
    }
}