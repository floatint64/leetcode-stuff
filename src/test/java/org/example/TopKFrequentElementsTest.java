package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        int[] nums = new int[] {1,1,1,2,2,2,2,4};

        Assertions.assertArrayEquals(new int[] {2, 1}, topKFrequentElements.topKFrequent(nums, 2));
    }


    @Test
    void topKFrequent2() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        int[] nums = new int[] {1};

        Assertions.assertArrayEquals(new int[] {1}, topKFrequentElements.topKFrequent(nums, 1));
    }

    @Test
    void topKFrequent3() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        int[] nums = new int[] {1,1,1,1,2,2,1,1,1};

        Assertions.assertArrayEquals(new int[] {1, 2}, topKFrequentElements.topKFrequent(nums, 2));
    }

    @Test
    void topKFrequent4() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        int[] nums = new int[] {1,1,1,2,3,4,1,1,1};

        Assertions.assertArrayEquals(new int[] {1}, topKFrequentElements.topKFrequent(nums, 1));
    }

    @Test
    void topKFrequent5() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        int[] nums = new int[] {1,1,1,2,3,4,1,1,1,4,4,4};

        Assertions.assertArrayEquals(new int[] {1,4,3}, topKFrequentElements.topKFrequent(nums, 3));
    }

    @Test
    void topKFrequent6() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        int[] nums = new int[] {4,1,-1,2,-1,2,3};

        Assertions.assertArrayEquals(new int[] {2,-1}, topKFrequentElements.topKFrequent(nums, 2));
    }

}