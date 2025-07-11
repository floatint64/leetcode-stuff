package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {

    @Test
    void findMaxLength() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,1};

        Assertions.assertEquals(2, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength2() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,1,0};

        Assertions.assertEquals(2, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength3() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,1,1,1,1,1,0,0,0};

        Assertions.assertEquals(6, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength4() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,1,1,0,0,0,1,1,1};

        Assertions.assertEquals(6, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength5() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,0,0,1,1,1,0,0,0,0,1,1,1,1};

        Assertions.assertEquals(8, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength6() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,1,1,0,1,1,0,0};

        Assertions.assertEquals(4, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength7() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {1,0,0,0,0,1};

        Assertions.assertEquals(2, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength8() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0};

        Assertions.assertEquals(0, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength9() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {1,1,1,1,1,1,1,1};

        Assertions.assertEquals(0, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength10() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {1,0,0,0,0,1,1,1};

        Assertions.assertEquals(6, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength11() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,1,0,1};

        Assertions.assertEquals(4, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength12() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {0,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1};

        Assertions.assertEquals(6, contiguousArray.findMaxLength(nums));
    }

    @Test
    void findMaxLength13() {

        ContiguousArray contiguousArray = new ContiguousArray();

        int[] nums = {1,1,1,0,0,0};

        Assertions.assertEquals(6, contiguousArray.findMaxLength(nums));
    }

}