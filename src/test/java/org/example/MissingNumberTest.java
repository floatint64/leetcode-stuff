package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void missingNumber() {
        MissingNumber missingNumber = new MissingNumber();

        int[] a = new int[] {3,0,1};

        Assertions.assertEquals(2, missingNumber.missingNumber(a));
    }

    @Test
    void missingNumber2() {
        MissingNumber missingNumber = new MissingNumber();

        int[] a = new int[] {0,1};

        Assertions.assertEquals(2, missingNumber.missingNumber(a));
    }

    @Test
    void missingNumber3() {
        MissingNumber missingNumber = new MissingNumber();

        int[] a = new int[] {9,6,4,2,3,5,7,0,1};

        Assertions.assertEquals(8, missingNumber.missingNumber(a));
    }
}