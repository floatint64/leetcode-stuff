package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightedWordMappingTest {

    @Test
    void mapWordWeights() {
        WeightedWordMapping w = new WeightedWordMapping();

        String[] words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        String expected = "rij";

        Assertions.assertEquals(expected, w.mapWordWeights(words, weights));
    }

    @Test
    void mapWordWeights2() {
        WeightedWordMapping w = new WeightedWordMapping();

        String[] words = {"a", "b", "c"};
        int[] weights = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        String expected = "yyy";

        Assertions.assertEquals(expected, w.mapWordWeights(words, weights));
    }

    @Test
    void mapWordWeights3() {
        WeightedWordMapping w = new WeightedWordMapping();

        String[] words = {"abcd"};
        int[] weights = {7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5};
        String expected = "g";

        Assertions.assertEquals(expected, w.mapWordWeights(words, weights));
    }
}