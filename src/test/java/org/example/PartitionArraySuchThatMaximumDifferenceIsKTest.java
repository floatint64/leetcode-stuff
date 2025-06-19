package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionArraySuchThatMaximumDifferenceIsKTest {

    @Test
    void partitionArray() {
        PartitionArraySuchThatMaximumDifferenceIsK part = new PartitionArraySuchThatMaximumDifferenceIsK();

        int[] nums = {3,6,1,2,5};
        int k = 2;

        Assertions.assertEquals(2, part.partitionArray(nums, k));
    }

    @Test
    void partitionArray2() {
        PartitionArraySuchThatMaximumDifferenceIsK part = new PartitionArraySuchThatMaximumDifferenceIsK();

        int[] nums = {1,2,3};
        int k = 1;

        Assertions.assertEquals(2, part.partitionArray(nums, k));
    }

    @Test
    void partitionArray3() {
        PartitionArraySuchThatMaximumDifferenceIsK part = new PartitionArraySuchThatMaximumDifferenceIsK();

        int[] nums = {2,2,4,5};
        int k = 0;

        Assertions.assertEquals(3, part.partitionArray(nums, k));
    }

    @Test
    void partitionArray4() {
        PartitionArraySuchThatMaximumDifferenceIsK part = new PartitionArraySuchThatMaximumDifferenceIsK();

        int[] nums = {2,2,2,2};
        int k = 0;

        Assertions.assertEquals(1, part.partitionArray(nums, k));
    }

    @Test
    void partitionArray5() {
        PartitionArraySuchThatMaximumDifferenceIsK part = new PartitionArraySuchThatMaximumDifferenceIsK();

        int[] nums = {2};
        int k = 1;

        Assertions.assertEquals(1, part.partitionArray(nums, k));
    }

    @Test
    void partitionArray6() {
        PartitionArraySuchThatMaximumDifferenceIsK part = new PartitionArraySuchThatMaximumDifferenceIsK();

        int[] nums = {1,2,2,9,4,4,5,6,7};
        int k = 2;

        Assertions.assertEquals(3, part.partitionArray(nums, k));
    }

    @Test
    void partitionArray7() {
        PartitionArraySuchThatMaximumDifferenceIsK part = new PartitionArraySuchThatMaximumDifferenceIsK();

        int[] nums = {0,1,0,1,1,0,1,1,0,0,0};
        int k = 0;

        Assertions.assertEquals(2, part.partitionArray(nums, k));
    }
}