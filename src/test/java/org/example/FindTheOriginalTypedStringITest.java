package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheOriginalTypedStringITest {

    @Test
    void possibleStringCount() {
        FindTheOriginalTypedStringI find = new FindTheOriginalTypedStringI();

        String word = "abbcccc";

        Assertions.assertEquals(5, find.possibleStringCount(word));
    }

    @Test
    void possibleStringCount2() {
        FindTheOriginalTypedStringI find = new FindTheOriginalTypedStringI();

        String word = "abcd";

        Assertions.assertEquals(1, find.possibleStringCount(word));
    }

    @Test
    void possibleStringCount3() {
        FindTheOriginalTypedStringI find = new FindTheOriginalTypedStringI();

        String word = "aaaa";

        Assertions.assertEquals(4, find.possibleStringCount(word));
    }

    @Test
    void possibleStringCount4() {
        FindTheOriginalTypedStringI find = new FindTheOriginalTypedStringI();

        String word = "abcdee";

        Assertions.assertEquals(2, find.possibleStringCount(word));
    }

    @Test
    void possibleStringCount5() {
        FindTheOriginalTypedStringI find = new FindTheOriginalTypedStringI();

        String word = "abcddee";

        Assertions.assertEquals(3, find.possibleStringCount(word));
    }

    @Test
    void possibleStringCount6() {
        FindTheOriginalTypedStringI find = new FindTheOriginalTypedStringI();

        String word = "a";

        Assertions.assertEquals(1, find.possibleStringCount(word));
    }

    @Test
    void possibleStringCount7() {
        FindTheOriginalTypedStringI find = new FindTheOriginalTypedStringI();

        String word = "ere";

        Assertions.assertEquals(1, find.possibleStringCount(word));
    }
}