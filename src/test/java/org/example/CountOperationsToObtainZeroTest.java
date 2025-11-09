package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOperationsToObtainZeroTest {

    @Test
    void countOperations() {

        CountOperationsToObtainZero cnt = new CountOperationsToObtainZero();

        Assertions.assertEquals(3, cnt.countOperations(2, 3));
    }

    @Test
    void countOperations2() {

        CountOperationsToObtainZero cnt = new CountOperationsToObtainZero();

        Assertions.assertEquals(1, cnt.countOperations(10, 10));
    }

    @Test
    void countOperations3() {

        CountOperationsToObtainZero cnt = new CountOperationsToObtainZero();

        Assertions.assertEquals(0, cnt.countOperations(0, 10));
    }
}