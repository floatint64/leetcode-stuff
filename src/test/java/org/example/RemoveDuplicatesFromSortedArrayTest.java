package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        int[] nums = {1,1,2};

        Assertions.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    void removeDuplicates2() {

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Assertions.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}