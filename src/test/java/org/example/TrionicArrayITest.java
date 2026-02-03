package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrionicArrayITest {

    @Test
    void isTrionic() {

        TrionicArrayI trionic = new TrionicArrayI();

        int[] nums = {1,3,5,4,2,6};

        Assertions.assertTrue(trionic.isTrionic(nums));
    }

    @Test
    void isTrionic2() {

        TrionicArrayI trionic = new TrionicArrayI();

        int[] nums = {2,1,3};

        Assertions.assertFalse(trionic.isTrionic(nums));
    }

    @Test
    void isTrionic3() {

        TrionicArrayI trionic = new TrionicArrayI();

        int[] nums = {1,2,3,4,5,4,3,2,3,4,5,6};

        Assertions.assertTrue(trionic.isTrionic(nums));
    }

    @Test
    void isTrionic4() {

        TrionicArrayI trionic = new TrionicArrayI();

        int[] nums = {1,2,3,4,5,4,3,2,3,4,5,6,0};

        Assertions.assertFalse(trionic.isTrionic(nums));
    }

    @Test
    void isTrionic5() {

        TrionicArrayI trionic = new TrionicArrayI();

        int[] nums = {1,2,1,2};

        Assertions.assertTrue(trionic.isTrionic(nums));
    }

    @Test
    void isTrionic6() {

        TrionicArrayI trionic = new TrionicArrayI();

        int[] nums = {2,4,3,3};

        Assertions.assertFalse(trionic.isTrionic(nums));
    }
}