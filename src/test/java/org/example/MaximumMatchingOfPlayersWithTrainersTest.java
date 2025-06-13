package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumMatchingOfPlayersWithTrainersTest {

    @Test
    void matchPlayersAndTrainers() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {4,7,9};
        int[] trainers = {8,2,5,8};

        Assertions.assertEquals(2, max.matchPlayersAndTrainers(players, trainers));
    }

    @Test
    void matchPlayersAndTrainers2() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {1,1,1};
        int[] trainers = {10};

        Assertions.assertEquals(1, max.matchPlayersAndTrainers(players, trainers));
    }

    @Test
    void matchPlayersAndTrainers3() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {1,1,1};
        int[] trainers = {1,1,1};

        Assertions.assertEquals(3, max.matchPlayersAndTrainers(players, trainers));
    }

    @Test
    void matchPlayersAndTrainers4() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {4};
        int[] trainers = {8};

        Assertions.assertEquals(1, max.matchPlayersAndTrainers(players, trainers));
    }

    @Test
    void matchPlayersAndTrainers5() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {4,4,4};
        int[] trainers = {8};

        Assertions.assertEquals(1, max.matchPlayersAndTrainers(players, trainers));
    }

    @Test
    void matchPlayersAndTrainers6() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {4};
        int[] trainers = {8,8,8};

        Assertions.assertEquals(1, max.matchPlayersAndTrainers(players, trainers));
    }

    @Test
    void matchPlayersAndTrainers7() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {10,20,30};
        int[] trainers = {1,1,1,1,1,15,19,19,21,22,23,25,29,30};

        Assertions.assertEquals(3, max.matchPlayersAndTrainers(players, trainers));
    }

    @Test
    void matchPlayersAndTrainers8() {
        MaximumMatchingOfPlayersWithTrainers max = new MaximumMatchingOfPlayersWithTrainers();

        int[] players = {10,20,30};
        int[] trainers = {1,1,1,1,1,15,19,19,21,22,23,25,29};

        Assertions.assertEquals(2, max.matchPlayersAndTrainers(players, trainers));
    }

}