package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumIndexSumOfTwoListsTest {

    @Test
    void findRestaurant() {
        MinimumIndexSumOfTwoLists min = new MinimumIndexSumOfTwoLists();

        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] expected = {"Shogun"};

        Assertions.assertArrayEquals(expected, min.findRestaurant(list1, list2));
    }

    @Test
    void findRestaurant2() {
        MinimumIndexSumOfTwoLists min = new MinimumIndexSumOfTwoLists();

        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] expected = {"Shogun"};

        Assertions.assertArrayEquals(expected, min.findRestaurant(list1, list2));
    }

    @Test
    void findRestaurant3() {
        MinimumIndexSumOfTwoLists min = new MinimumIndexSumOfTwoLists();

        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        String[] expected = {"sad","happy"};

        Assertions.assertArrayEquals(expected, min.findRestaurant(list1, list2));
    }

    @Test
    void findRestaurant4() {
        MinimumIndexSumOfTwoLists min = new MinimumIndexSumOfTwoLists();

        String[] list1 = {"happy"};
        String[] list2 = {"sad"};
        String[] expected = {};

        Assertions.assertArrayEquals(expected, min.findRestaurant(list1, list2));
    }

    @Test
    void findRestaurant5() {
        MinimumIndexSumOfTwoLists min = new MinimumIndexSumOfTwoLists();

        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"good"};
        String[] expected = {"good"};

        Assertions.assertArrayEquals(expected, min.findRestaurant(list1, list2));
    }
}