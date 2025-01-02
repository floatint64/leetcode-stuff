package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "abcabcbb";

        Assertions.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring2() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "bbbbb";

        Assertions.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring3() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "pwwkew";

        Assertions.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring4() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = " ";

        Assertions.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring5() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String s = "dvdf";

        Assertions.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
}