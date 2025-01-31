package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void firstBadVersion() {
        var c = new FirstBadVersion(2);
        Assertions.assertEquals(2, c.firstBadVersion(2));
    }

    @Test
    void firstBadVersion2() {
        var c = new FirstBadVersion(2);
        Assertions.assertEquals(2, c.firstBadVersion(3));
    }
}