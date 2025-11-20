package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNAndItsDoubleExistTest {

    @Test
    void checkIfExist() {
        CheckIfNAndItsDoubleExist check = new CheckIfNAndItsDoubleExist();

        int[] arr = {10,2,5,3};

        Assertions.assertTrue(check.checkIfExist(arr));
    }

    @Test
    void checkIfExist2() {
        CheckIfNAndItsDoubleExist check = new CheckIfNAndItsDoubleExist();

        int[] arr = {3,1,7,11};

        Assertions.assertFalse(check.checkIfExist(arr));
    }

    @Test
    void checkIfExist3() {
        CheckIfNAndItsDoubleExist check = new CheckIfNAndItsDoubleExist();

        int[] arr = {-1,-2};

        Assertions.assertTrue(check.checkIfExist(arr));
    }

    @Test
    void checkIfExist4() {
        CheckIfNAndItsDoubleExist check = new CheckIfNAndItsDoubleExist();

        int[] arr = {-2,4};

        Assertions.assertFalse(check.checkIfExist(arr));
    }

    @Test
    void checkIfExist5() {
        CheckIfNAndItsDoubleExist check = new CheckIfNAndItsDoubleExist();

        int[] arr = {-1,-3};

        Assertions.assertFalse(check.checkIfExist(arr));
    }

    @Test
    void checkIfExist6() {
        CheckIfNAndItsDoubleExist check = new CheckIfNAndItsDoubleExist();

        int[] arr = {-1,3};

        Assertions.assertFalse(check.checkIfExist(arr));
    }
}