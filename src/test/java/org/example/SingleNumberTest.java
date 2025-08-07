package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumber() {
        SingleNumber singleNumber = new SingleNumber();

        int[] nums = {2,2,1};

        Assertions.assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    void singleNumber2() {
        SingleNumber singleNumber = new SingleNumber();

        int[] nums = {4,1,2,1,2};

        Assertions.assertEquals(4, singleNumber.singleNumber(nums));
    }

    @Test
    void singleNumber3() {
        SingleNumber singleNumber = new SingleNumber();

        int[] nums = {1};

        Assertions.assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    void singleNumber4() {
        SingleNumber singleNumber = new SingleNumber();

        int[] nums = {1,3,1,0,2,3,4,0,2,};

        Assertions.assertEquals(4, singleNumber.singleNumber(nums));
    }

    @Test
    void singleNumber5() {
        SingleNumber singleNumber = new SingleNumber();

        int[] nums = {1,3,1,0,2,3,-10,0,2,};

        Assertions.assertEquals(-10, singleNumber.singleNumber(nums));
    }
}