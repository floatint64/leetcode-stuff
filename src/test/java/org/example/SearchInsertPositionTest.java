package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,3,5,6};
        int target = 5;

        Assertions.assertEquals(2, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert2() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,3,5,6};
        int target = 2;

        Assertions.assertEquals(1, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert3() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,3,5,6};
        int target = 7;

        Assertions.assertEquals(4, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert4() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,3,5,6};
        int target = 0;

        Assertions.assertEquals(0, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert5() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,3};
        int target = 2;

        Assertions.assertEquals(1, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert6() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1};
        int target = 2;

        Assertions.assertEquals(1, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert7() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {};
        int target = 2;

        Assertions.assertEquals(0, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert8() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,2,3,4};
        int target = 4;

        Assertions.assertEquals(3, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert9() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,2,3,4};
        int target = 3;

        Assertions.assertEquals(2, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert10() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,2,3,4};
        int target = 1;

        Assertions.assertEquals(0, searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert11() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1,2,3,4};
        int target = 2;

        Assertions.assertEquals(1, searchInsertPosition.searchInsert(nums, target));
    }
}