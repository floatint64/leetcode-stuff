package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var result = new ArrayList<Integer>(50);

        for (int i = 0; i < words.length; i++) {
            boolean[] charAdded = {
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false,
                    false, false
            };
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x && !charAdded[x - 97]) {
                    result.add(i);
                    charAdded[x - 97] = true;
                    break;
                }
            }
        }

        return result;
    }
}
