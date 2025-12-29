package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {
        HappyNumber happy = new HappyNumber();

        Assertions.assertTrue(happy.isHappy(19));
    }

    @Test
    void isHappy2() {
        HappyNumber happy = new HappyNumber();

        Assertions.assertFalse(happy.isHappy(2));
    }

    @Test
    void isHappy3() {
        HappyNumber happy = new HappyNumber();

        Assertions.assertTrue(happy.isHappy(1111111));
    }
}