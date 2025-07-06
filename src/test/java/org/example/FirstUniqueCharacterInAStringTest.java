package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    @Test
    void firstUniqChar() {
        FirstUniqueCharacterInAString first = new FirstUniqueCharacterInAString();

        String s = "leetcode";

        Assertions.assertEquals(0, first.firstUniqChar(s));
    }

    @Test
    void firstUniqChar2() {
        FirstUniqueCharacterInAString first = new FirstUniqueCharacterInAString();

        String s = "loveleetcode";

        Assertions.assertEquals(2, first.firstUniqChar(s));
    }

    @Test
    void firstUniqChar3() {
        FirstUniqueCharacterInAString first = new FirstUniqueCharacterInAString();

        String s = "aabb";

        Assertions.assertEquals(-1, first.firstUniqChar(s));
    }

    @Test
    void firstUniqChar4() {
        FirstUniqueCharacterInAString first = new FirstUniqueCharacterInAString();

        String s = "a";

        Assertions.assertEquals(0, first.firstUniqChar(s));
    }
}