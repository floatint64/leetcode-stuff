package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int nums[] = {1, 2, 3, 1};

        Assertions.assertTrue(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    void containsDuplicate2() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int nums[] = {1, 2, 3, 4};

        Assertions.assertFalse(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    void containsDuplicate3() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        Assertions.assertTrue(containsDuplicate.containsDuplicate(nums));
    }
}