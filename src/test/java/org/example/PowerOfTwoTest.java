package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @Test
    void isPowerOfTwo() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertTrue(powerOfTwo.isPowerOfTwo(2));
    }

    @Test
    void isPowerOfTwo2() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertTrue(powerOfTwo.isPowerOfTwo(4));
    }

    @Test
    void isPowerOfTwo3() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertTrue(powerOfTwo.isPowerOfTwo(32));
    }

    @Test
    void isPowerOfTwo4() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(6));
    }

    @Test
    void isPowerOfTwo5() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(10));
    }

    @Test
    void isPowerOfTwo6() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(3));
    }

    @Test
    void isPowerOfTwo7() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(11));
    }

    @Test
    void isPowerOfTwo8() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(0));
    }

    @Test
    void isPowerOfTwo9() {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assertions.assertFalse(powerOfTwo.isPowerOfTwo(Integer.MIN_VALUE));
    }
}