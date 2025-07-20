package org.example;

import java.util.Arrays;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        int[] mappedChars = new int[256];
        int[] invertedChars = new int[256];

        Arrays.fill(mappedChars, -1);
        Arrays.fill(invertedChars, -1);

        for (int i = 0; i < s.length(); i++) {
            if (mappedChars[s.charAt(i)] == -1) {
                mappedChars[s.charAt(i)] = t.charAt(i);
                if (invertedChars[t.charAt(i)] != -1 && invertedChars[t.charAt(i)] != s.charAt(i)) {
                    return false;
                }
                invertedChars[t.charAt(i)] = s.charAt(i);
            } else if (s.charAt(i) != invertedChars[t.charAt(i)]){
                return false;
            }
        }

        return true;
    }
}
