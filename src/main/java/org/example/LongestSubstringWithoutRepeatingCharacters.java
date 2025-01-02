package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int currentMax = 0;

        Set<Character> charSet = new HashSet<>();

        int i = 0;
        while (i < s.length()) {
            charSet.add(s.charAt(i));
            int j = i + 1;
            while (j < s.length()) {
                if (charSet.contains(s.charAt(j))) {
                    break;
                } else {
                    charSet.add(s.charAt(j));
                }
                j++;
            }
            currentMax = Math.max(currentMax, j - i);
            i++;
            charSet.clear();
        }

        return currentMax;
    }
}
