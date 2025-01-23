package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    @Test
    void pivotIndex() {
        FindPivotIndex pivot = new FindPivotIndex();

        int[] nums = {1,7,3,6,5,6};

        Assertions.assertEquals(3, pivot.pivotIndex(nums));
    }

    @Test
    void pivotIndex2() {
        FindPivotIndex pivot = new FindPivotIndex();

        int[] nums = {1,2,3};

        Assertions.assertEquals(-1, pivot.pivotIndex(nums));
    }

    @Test
    void pivotIndex3() {
        FindPivotIndex pivot = new FindPivotIndex();

        int[] nums = {2,1,-1};

        Assertions.assertEquals(0, pivot.pivotIndex(nums));
    }
}