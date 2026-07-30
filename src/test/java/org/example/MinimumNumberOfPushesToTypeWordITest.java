package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfPushesToTypeWordITest {

    @Test
    void minimumPushes() {
        MinimumNumberOfPushesToTypeWordI m = new MinimumNumberOfPushesToTypeWordI();

        var word = "abcde";
        int expected = 5;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes2() {
        MinimumNumberOfPushesToTypeWordI m = new MinimumNumberOfPushesToTypeWordI();

        var word = "xycdefghij";
        int expected = 12;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes3() {
        MinimumNumberOfPushesToTypeWordI m = new MinimumNumberOfPushesToTypeWordI();

        var word = "abcdefgh";
        int expected = 8;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes4() {
        MinimumNumberOfPushesToTypeWordI m = new MinimumNumberOfPushesToTypeWordI();

        var word = "abcdefghijklmnop";
        int expected = 8 + (8 * 2);

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes5() {
        MinimumNumberOfPushesToTypeWordI m = new MinimumNumberOfPushesToTypeWordI();

        var word = "abcdefghijklmnopqrs";
        int expected = 8 + (8 * 2) + (3 * 3);

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes6() {
        MinimumNumberOfPushesToTypeWordI m = new MinimumNumberOfPushesToTypeWordI();

        var word = "abcdefghijklmnopqrstuvwxyz";
        int expected = 8 + (8 * 2) + (8 * 3) + (2 * 4);

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes7() {
        MinimumNumberOfPushesToTypeWordI m = new MinimumNumberOfPushesToTypeWordI();

        var word = "l";
        int expected = 1;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }
}