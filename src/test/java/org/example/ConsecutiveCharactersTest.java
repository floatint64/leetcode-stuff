package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveCharactersTest {

    @Test
    void maxPower() {
        ConsecutiveCharacters max = new ConsecutiveCharacters();

        String s = "leetcode";

        Assertions.assertEquals(2, max.maxPower(s));
    }

    @Test
    void maxPower2() {
        ConsecutiveCharacters max = new ConsecutiveCharacters();

        String s = "abbcccddddeeeeedcba";

        Assertions.assertEquals(5, max.maxPower(s));
    }

    @Test
    void maxPower3() {
        ConsecutiveCharacters max = new ConsecutiveCharacters();

        String s = "l";

        Assertions.assertEquals(1, max.maxPower(s));
    }

    @Test
    void maxPower4() {
        ConsecutiveCharacters max = new ConsecutiveCharacters();

        String s = "llllrrr";

        Assertions.assertEquals(4, max.maxPower(s));
    }

    @Test
    void maxPower5() {
        ConsecutiveCharacters max = new ConsecutiveCharacters();

        String s = "aaabbaaaaccaaaaaaaa";

        Assertions.assertEquals(8, max.maxPower(s));
    }

    @Test
    void maxPower6() {
        ConsecutiveCharacters max = new ConsecutiveCharacters();

        String s = "aaabbcccc";

        Assertions.assertEquals(4, max.maxPower(s));
    }
}