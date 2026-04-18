package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MirrorDistanceOfAnIntegerTest {

    @Test
    void mirrorDistance() {
        MirrorDistanceOfAnInteger m = new MirrorDistanceOfAnInteger();

        int n = 25;
        int expected = 27;

        Assertions.assertEquals(expected, m.mirrorDistance(n));
    }

    @Test
    void mirrorDistance2() {
        MirrorDistanceOfAnInteger m = new MirrorDistanceOfAnInteger();

        int n = 10;
        int expected = 9;

        Assertions.assertEquals(expected, m.mirrorDistance(n));
    }

    @Test
    void mirrorDistance3() {
        MirrorDistanceOfAnInteger m = new MirrorDistanceOfAnInteger();

        int n = 7;
        int expected = 0;

        Assertions.assertEquals(expected, m.mirrorDistance(n));
    }

    @Test
    void mirrorDistance4() {
        MirrorDistanceOfAnInteger m = new MirrorDistanceOfAnInteger();

        int n = 1;
        int expected = 0;

        Assertions.assertEquals(expected, m.mirrorDistance(n));
    }
}