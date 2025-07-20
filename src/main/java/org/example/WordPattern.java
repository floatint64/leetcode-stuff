package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = new String[s.length()];
        int lastWordPos = 0;

        int si = 0;
        int wordLen = 0;
        while (si < s.length()) {
            while (si < s.length() && s.charAt(si) != ' ') {
                wordLen++;
                si++;
            }
            words[lastWordPos++] = s.substring(si - wordLen, si);
            wordLen = 0;
            si++;
        }

        if (pattern.length() != lastWordPos) {
            return false;
        }

        Map<String, Character> wordMap = new HashMap<>();
        Map<Character, String> charMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            var mappedChar = wordMap.get(words[i]);
            var mappedWord = charMap.get(pattern.charAt(i));

            if ((mappedWord != null && mappedChar == null) || (mappedChar != null && mappedChar != pattern.charAt(i))) {
                return false;
            }

            wordMap.put(words[i], pattern.charAt(i));
            charMap.put(pattern.charAt(i), words[i]);
        }

        return true;
    }
}
