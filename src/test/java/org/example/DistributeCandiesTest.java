package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCandiesTest {

    @Test
    void distributeCandies() {
        DistributeCandies distributeCandies = new DistributeCandies();

        int[] candyTypes = {1,1,2,2,3,3};
        int expected = 3;

        Assertions.assertEquals(expected, distributeCandies.distributeCandies(candyTypes));
    }

    @Test
    void distributeCandies2() {
        DistributeCandies distributeCandies = new DistributeCandies();

        int[] candyTypes = {1,1,2,3};
        int expected = 2;

        Assertions.assertEquals(expected, distributeCandies.distributeCandies(candyTypes));
    }

    @Test
    void distributeCandies3() {
        DistributeCandies distributeCandies = new DistributeCandies();

        int[] candyTypes = {6,6,6,6};
        int expected = 1;

        Assertions.assertEquals(expected, distributeCandies.distributeCandies(candyTypes));
    }

    @Test
    void distributeCandies4() {
        DistributeCandies distributeCandies = new DistributeCandies();

        int[] candyTypes = {1,2};
        int expected = 1;

        Assertions.assertEquals(expected, distributeCandies.distributeCandies(candyTypes));
    }

    @Test
    void distributeCandies5() {
        DistributeCandies distributeCandies = new DistributeCandies();

        int[] candyTypes = {1,1};
        int expected = 1;

        Assertions.assertEquals(expected, distributeCandies.distributeCandies(candyTypes));
    }
}