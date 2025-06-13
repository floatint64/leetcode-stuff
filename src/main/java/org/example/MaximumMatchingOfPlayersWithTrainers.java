package org.example;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        int matched = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;
        int j = 0;

        while (j < trainers.length && players[i] > trainers[j]) {
            j++;
        }

        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                matched++;
                i++;
            }
            j++;
        }

        return matched;
    }
}
