package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();

        String[] strs = {"test", "task", "trick"};

        Assertions.assertEquals("t", prefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix2() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();

        String[] strs = {"steam", "steampunk", "star"};

        Assertions.assertEquals("st", prefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix3() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();

        String[] strs = {"keks", "e", "kick"};

        Assertions.assertEquals("", prefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix4() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();

        String[] strs = {"k", "e", "l"};

        Assertions.assertEquals("", prefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix5() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();

        String[] strs = {"keks", "keks", "keks"};

        Assertions.assertEquals("keks", prefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix6() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();

        String[] strs = {"", "", ""};

        Assertions.assertEquals("", prefix.longestCommonPrefix(strs));
    }
}