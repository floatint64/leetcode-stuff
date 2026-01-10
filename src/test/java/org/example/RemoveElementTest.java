package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        RemoveElement remove = new RemoveElement();

        int[] nums = {3,2,2,3};
        int k = 3;

        int[] expected = {2,2};

        int result = remove.removeElement(nums, k);

        Assertions.assertEquals(expected.length, result);

        Arrays.sort(nums, 0, result);

        for (int i = 0; i < result; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void removeElement2() {
        RemoveElement remove = new RemoveElement();

        int[] nums = {1,1,1};
        int k = 1;

        int[] expected = {};

        int result = remove.removeElement(nums, k);

        Assertions.assertEquals(expected.length, result);

        Arrays.sort(nums, 0, result);

        for (int i = 0; i < result; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void removeElement3() {
        RemoveElement remove = new RemoveElement();

        int[] nums = {};
        int k = 3;

        int[] expected = {};

        int result = remove.removeElement(nums, k);

        Assertions.assertEquals(expected.length, result);

        Arrays.sort(nums, 0, result);

        for (int i = 0; i < result; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void removeElement4() {
        RemoveElement remove = new RemoveElement();

        int[] nums = {1,1,1,2,3,3,3};
        int k = 2;

        int[] expected = {1,1,1,3,3,3};

        int result = remove.removeElement(nums, k);

        Assertions.assertEquals(expected.length, result);

        Arrays.sort(nums, 0, result);

        for (int i = 0; i < result; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void removeElement5() {
        RemoveElement remove = new RemoveElement();

        int[] nums = {1,1,1,2,2,2};
        int k = 2;

        int[] expected = {1,1,1};

        int result = remove.removeElement(nums, k);

        Assertions.assertEquals(expected.length, result);

        Arrays.sort(nums, 0, result);

        for (int i = 0; i < result; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void removeElement6() {
        RemoveElement remove = new RemoveElement();

        int[] nums = {2,2,2,1,1,1};
        int k = 2;

        int[] expected = {1,1,1};

        int result = remove.removeElement(nums, k);

        Assertions.assertEquals(expected.length, result);

        Arrays.sort(nums, 0, result);

        for (int i = 0; i < result; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void removeElement7() {
        RemoveElement remove = new RemoveElement();

        int[] nums = {0,1,2,2,3,0,4,2};
        int k = 2;

        int[] expected = {0,0,1,3,4};

        int result = remove.removeElement(nums, k);

        Assertions.assertEquals(expected.length, result);

        Arrays.sort(nums, 0, result);

        for (int i = 0; i < result; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }
}