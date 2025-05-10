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

    @Test
    void firstBadVersion3() {
        var c = new FirstBadVersion(1702766719);
        Assertions.assertEquals(1702766719, c.firstBadVersion(2126753390));
    }

    @Test
    void firstBadVersion4() {
        var c = new FirstBadVersion(1);
        Assertions.assertEquals(1, c.firstBadVersion(2));
    }
}