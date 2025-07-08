package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SortCharactersByFrequencyTest {

    @Test
    void frequencySort() {
        SortCharactersByFrequency sort = new SortCharactersByFrequency();

        String s = "aaaba";

        Assertions.assertEquals("aaaab", sort.frequencySort(s));
    }

    @Test
    void frequencySort2() {
        SortCharactersByFrequency sort = new SortCharactersByFrequency();

        String s = "tree";

        Assertions.assertEquals("eert", sort.frequencySort(s));
    }

    @Test
    void frequencySort3() {
        SortCharactersByFrequency sort = new SortCharactersByFrequency();

        String s = "cccaaa";

        Assertions.assertTrue(Set.of("cccaaa", "aaaccc").contains(sort.frequencySort(s)));
    }

    @Test
    void frequencySort4() {
        SortCharactersByFrequency sort = new SortCharactersByFrequency();

        String s = "Aabb";

        Assertions.assertTrue(Set.of("bbaA", "bbAa").contains(sort.frequencySort(s)));
    }

    @Test
    void frequencySort5() {
        SortCharactersByFrequency sort = new SortCharactersByFrequency();

        String s = "abaccadeeefaafcc";

        Assertions.assertTrue(Set.of("aaaaacccceeeffdb", "aaaaacccceeeffbd").contains(sort.frequencySort(s)));
    }
}