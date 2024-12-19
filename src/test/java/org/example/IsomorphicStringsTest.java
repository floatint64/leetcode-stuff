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
}