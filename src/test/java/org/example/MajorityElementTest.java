package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElement() {
        MajorityElement majorityElement = new MajorityElement();

        int nums[] = {3, 2, 3};
        int exp = 3;

        Assertions.assertEquals(exp, majorityElement.majorityElement(nums));
    }

    @Test
    void majorityElement2() {
        MajorityElement majorityElement = new MajorityElement();

        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int exp = 2;

        Assertions.assertEquals(exp, majorityElement.majorityElement(nums));
    }
}