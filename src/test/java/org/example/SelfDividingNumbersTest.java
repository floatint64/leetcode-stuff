package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelfDividingNumbersTest {

    @Test
    void selfDividingNumbers() {
        SelfDividingNumbers self = new SelfDividingNumbers();

        int left = 1;
        int right = 22;
        var expected = List.of(
                1,2,3,4,5,6,7,8,9,11,12,15,22
        );

        Assertions.assertEquals(expected, self.selfDividingNumbers(left, right));
    }

    @Test
    void selfDividingNumbers2() {
        SelfDividingNumbers self = new SelfDividingNumbers();

        int left = 47;
        int right = 85;
        var expected = List.of(
                48,55,66,77
        );

        Assertions.assertEquals(expected, self.selfDividingNumbers(left, right));
    }
}