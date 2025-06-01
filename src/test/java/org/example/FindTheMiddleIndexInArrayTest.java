package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMiddleIndexInArrayTest {

    @Test
    void findMiddleIndex() {
        FindTheMiddleIndexInArray findTheMiddleIndexInArray = new FindTheMiddleIndexInArray();

        int[] nums = {2,3,-1,8,4};

        Assertions.assertEquals(3, findTheMiddleIndexInArray.findMiddleIndex(nums));
    }

    @Test
    void findMiddleIndex2() {
        FindTheMiddleIndexInArray findTheMiddleIndexInArray = new FindTheMiddleIndexInArray();

        int[] nums = {1, -1, 4};

        Assertions.assertEquals(2, findTheMiddleIndexInArray.findMiddleIndex(nums));
    }

    @Test
    void findMiddleIndex3() {
        FindTheMiddleIndexInArray findTheMiddleIndexInArray = new FindTheMiddleIndexInArray();

        int[] nums = {2,5};

        Assertions.assertEquals(-1, findTheMiddleIndexInArray.findMiddleIndex(nums));
    }

    @Test
    void findMiddleIndex4() {
        FindTheMiddleIndexInArray findTheMiddleIndexInArray = new FindTheMiddleIndexInArray();

        int[] nums = {5,2,1,1,1,1,1};

        Assertions.assertEquals(1, findTheMiddleIndexInArray.findMiddleIndex(nums));
    }

    @Test
    void findMiddleIndex5() {
        FindTheMiddleIndexInArray findTheMiddleIndexInArray = new FindTheMiddleIndexInArray();

        int[] nums = {1,1,1,1,1,1,1};

        Assertions.assertEquals(3, findTheMiddleIndexInArray.findMiddleIndex(nums));
    }

    @Test
    void findMiddleIndex6() {
        FindTheMiddleIndexInArray findTheMiddleIndexInArray = new FindTheMiddleIndexInArray();

        int[] nums = {1};

        Assertions.assertEquals(0, findTheMiddleIndexInArray.findMiddleIndex(nums));
    }

    @Test
    void findMiddleIndex7() {
        FindTheMiddleIndexInArray findTheMiddleIndexInArray = new FindTheMiddleIndexInArray();

        int[] nums = {-1,-1,-1,-1,-1};

        Assertions.assertEquals(2, findTheMiddleIndexInArray.findMiddleIndex(nums));
    }
}