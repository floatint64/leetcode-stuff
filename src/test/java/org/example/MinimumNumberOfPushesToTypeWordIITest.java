package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfPushesToTypeWordIITest {

    @Test
    void minimumPushes() {
        MinimumNumberOfPushesToTypeWordII m = new MinimumNumberOfPushesToTypeWordII();

        var word = "abcde";
        var expected = 5;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes2() {
        MinimumNumberOfPushesToTypeWordII m = new MinimumNumberOfPushesToTypeWordII();

        var word = "xyzxyzxyzxyz";
        var expected = 12;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes3() {
        MinimumNumberOfPushesToTypeWordII m = new MinimumNumberOfPushesToTypeWordII();

        var word = "aabbccddeeffgghhiiiiii";
        var expected = 24;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes4() {
        MinimumNumberOfPushesToTypeWordII m = new MinimumNumberOfPushesToTypeWordII();

        var word = "a";
        var expected = 1;

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }

    @Test
    void minimumPushes5() {
        MinimumNumberOfPushesToTypeWordII m = new MinimumNumberOfPushesToTypeWordII();

        var word = "abcdefghijklmnopqrstuvwxyz";
        int expected = 8 + (8 * 2) + (8 * 3) + (2 * 4);

        Assertions.assertEquals(expected, m.minimumPushes(word));
    }
}