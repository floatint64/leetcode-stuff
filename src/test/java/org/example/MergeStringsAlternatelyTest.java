package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    void mergeAlternately() {
        MergeStringsAlternately merge = new MergeStringsAlternately();

        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";

        Assertions.assertEquals(expected, merge.mergeAlternately(word1, word2));
    }

    @Test
    void mergeAlternately2() {
        MergeStringsAlternately merge = new MergeStringsAlternately();

        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";

        Assertions.assertEquals(expected, merge.mergeAlternately(word1, word2));
    }

    @Test
    void mergeAlternately3() {
        MergeStringsAlternately merge = new MergeStringsAlternately();

        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";

        Assertions.assertEquals(expected, merge.mergeAlternately(word1, word2));
    }
}