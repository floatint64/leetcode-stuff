package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    @Test
    void findPeakElement() {
        FindPeakElement findPeakElement = new FindPeakElement();

        int[] nums = {1,2,3,1};

        Assertions.assertEquals(2, findPeakElement.findPeakElement(nums));
    }

    @Test
    void findPeakElement2() {
        FindPeakElement findPeakElement = new FindPeakElement();

        int[] nums = {1,2,1,3,5,6,4};

        var validSet = Set.of(1, 5);

        Assertions.assertTrue(validSet.contains(findPeakElement.findPeakElement(nums)));
    }
}