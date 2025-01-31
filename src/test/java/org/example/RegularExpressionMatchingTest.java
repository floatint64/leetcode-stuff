package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    void isMatch() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "aa";
        String p = "a*";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch2() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "aa";
        String p = "a";

        Assertions.assertFalse(matcher.isMatch(s, p));
    }

    @Test
    void isMatch3() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "ab";
        String p = ".*";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch4() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "mississippi";
        String p = "mis*is*ip*.";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch5() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "poop";
        String p = "p..p";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch6() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "poop";
        String p = "p...";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch7() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "poop";
        String p = "....";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch8() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "beeb";
        String p = "...b";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch9() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "ab";
        String p = ".*c";

        Assertions.assertFalse(matcher.isMatch(s, p));
    }

    @Test
    void isMatch10() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "aaa";
        String p = "a*a";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }

    @Test
    void isMatch11() {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        String s = "aaa";
        String p = "ab*a*c*a";

        Assertions.assertTrue(matcher.isMatch(s, p));
    }
}