package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {

    @Test
    void containsNearbyDuplicate() {

        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();

        int[] nums = new int[] {1,2,3,1};
        int k = 3;

        Assertions.assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicate3() {

        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();

        int[] nums = new int[] {1,0,1,1};
        int k = 1;

        Assertions.assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, k));
    }


    @Test
    void containsNearbyDuplicate2() {

        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();

        int[] nums = new int[] {1,2,3,1,2,3};
        int k = 2;

        Assertions.assertFalse(containsDuplicateII.containsNearbyDuplicate(nums, k));
    }
}