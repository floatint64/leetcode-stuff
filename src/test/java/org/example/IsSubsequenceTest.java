package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        IsSubsequence sub = new IsSubsequence();

        String s = "abc";
        String t = "ahbgdc";

        Assertions.assertTrue(sub.isSubsequence(s, t));
    }

    @Test
    void isSubsequence2() {
        IsSubsequence sub = new IsSubsequence();

        String s = "axc";
        String t = "ahbgdc";

        Assertions.assertFalse(sub.isSubsequence(s, t));
    }

    @Test
    void isSubsequence3() {
        IsSubsequence sub = new IsSubsequence();

        String s = "axc";
        String t = "";

        Assertions.assertFalse(sub.isSubsequence(s, t));
    }

    @Test
    void isSubsequence4() {
        IsSubsequence sub = new IsSubsequence();

        String s = "";
        String t = "ahbgdc";

        Assertions.assertTrue(sub.isSubsequence(s, t));
    }

    @Test
    void isSubsequence5() {
        IsSubsequence sub = new IsSubsequence();

        String s = "a";
        String t = "a";

        Assertions.assertTrue(sub.isSubsequence(s, t));
    }

    @Test
    void isSubsequence6() {
        IsSubsequence sub = new IsSubsequence();

        String s = "";
        String t = "";

        Assertions.assertTrue(sub.isSubsequence(s, t));
    }
}