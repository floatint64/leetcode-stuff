package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        int[] totalFreq = new int['z' - 'a' + 1];
        Arrays.fill(totalFreq, Integer.MAX_VALUE);

        for (var w : words) {
            int[] localFreq = {
                    0,0,0,0,0,0,0,0,0,0,
                    0,0,0,0,0,0,0,0,0,0,
                    0,0,0,0,0,0
            };

            for (int i = 0; i < w.length(); i++) {
                localFreq[w.charAt(i) - 'a']++;
            }

            for (char i = 0; i <= 'z' - 'a'; i++) {
                totalFreq[i] = Math.min(totalFreq[i], localFreq[i]);
            }
        }

        for (char i = 0; i <= 'z' - 'a'; i++) {
            for (int j = 0; j < totalFreq[i]; j++) {
                result.add(String.valueOf((char)(i + 'a')));
            }
        }

        return result;
    }
}
