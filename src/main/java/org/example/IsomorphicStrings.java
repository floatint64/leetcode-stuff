package org.example;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        TreeMap<Character, Map.Entry<Character, Integer>> charMap = new TreeMap<>();

        var tChars = t.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity()));

        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                var charStat = charMap.get(s.charAt(i));
                charMap.put(s.charAt(i), Map.entry(t.charAt(i), charStat.getValue() + 1));
            } else {
                charMap.put(s.charAt(i), Map.entry(t.charAt(i), 1));
            }
        }

        for (var c : charMap.values()) {
            if (!c.getValue().equals(tChars.get(c.getKey()).size())) {
                return false;
            }
        }

        return true;
    }
}
