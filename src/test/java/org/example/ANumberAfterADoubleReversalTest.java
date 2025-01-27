package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ANumberAfterADoubleReversalTest {

    @Test
    void isSameAfterReversals() {
        ANumberAfterADoubleReversal reverse = new ANumberAfterADoubleReversal();

        int num = 526;

        Assertions.assertTrue(reverse.isSameAfterReversals(num));
    }

    @Test
    void isSameAfterReversals2() {
        ANumberAfterADoubleReversal reverse = new ANumberAfterADoubleReversal();

        int num = 1800;

        Assertions.assertFalse(reverse.isSameAfterReversals(num));
    }

    @Test
    void isSameAfterReversals3() {
        ANumberAfterADoubleReversal reverse = new ANumberAfterADoubleReversal();

        int num = 0;

        Assertions.assertTrue(reverse.isSameAfterReversals(num));
    }
}