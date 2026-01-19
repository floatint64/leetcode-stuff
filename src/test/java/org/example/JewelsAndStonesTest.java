package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

    @Test
    void numJewelsInStones() {
        JewelsAndStones j = new JewelsAndStones();

        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;

        Assertions.assertEquals(expected, j.numJewelsInStones(jewels, stones));
    }

    @Test
    void numJewelsInStones2() {
        JewelsAndStones j = new JewelsAndStones();

        String jewels = "z";
        String stones = "ZZ";
        int expected = 0;

        Assertions.assertEquals(expected, j.numJewelsInStones(jewels, stones));
    }

    @Test
    void numJewelsInStones3() {
        JewelsAndStones j = new JewelsAndStones();

        String jewels = "aAzZ";
        String stones = "aAzZ";
        int expected = 4;

        Assertions.assertEquals(expected, j.numJewelsInStones(jewels, stones));
    }

    @Test
    void numJewelsInStones4() {
        JewelsAndStones j = new JewelsAndStones();

        String jewels = "aAzZ";
        String stones = "aAvertzZ";
        int expected = 4;

        Assertions.assertEquals(expected, j.numJewelsInStones(jewels, stones));
    }
}