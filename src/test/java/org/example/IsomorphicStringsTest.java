package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void isIsomorphic() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
    }

    @Test
    void isIsomorphic2() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
    }

    @Test
    void isIsomorphic3() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));
    }

    @Test
    void isIsomorphic4() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertFalse(isomorphicStrings.isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    @Test
    void isIsomorphic5() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertFalse(isomorphicStrings.isIsomorphic("badc", "baba"));
    }

    @Test
    void isIsomorphic6() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertFalse(isomorphicStrings.isIsomorphic("egcd", "adfd"));
    }

    @Test
    void isIsomorphic7() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertTrue(isomorphicStrings.isIsomorphic("abcd", "oltp"));
    }

    @Test
    void isIsomorphic8() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertTrue(isomorphicStrings.isIsomorphic("abcd", "alek"));
    }

    @Test
    void isIsomorphic9() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertFalse(isomorphicStrings.isIsomorphic("aabb", "vvcd"));
    }

    @Test
    void isIsomorphic10() {

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        Assertions.assertTrue(isomorphicStrings.isIsomorphic("aabb", "vvcc"));
    }
}