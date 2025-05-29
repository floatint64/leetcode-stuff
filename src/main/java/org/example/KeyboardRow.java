package org.example;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

    private static final int[] CHAR_MAP = new int[123];

    static {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for (int i = 0; i < r1.length(); i++) {
            char chr = r1.charAt(i);
            CHAR_MAP[chr] = 1;
            CHAR_MAP[chr - 32] = 1;
        }

        for (int i = 0; i < r2.length(); i++) {
            char chr = r2.charAt(i);
            CHAR_MAP[chr] = 2;
            CHAR_MAP[chr - 32] = 2;
        }

        for (int i = 0; i < r3.length(); i++) {
            char chr = r3.charAt(i);
            CHAR_MAP[chr] = 3;
            CHAR_MAP[chr - 32] = 3;
        }
    }

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>(words.length);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            int row = CHAR_MAP[word.charAt(0)];
            boolean skip = false;

            for (int j = 1; j < word.length(); j++) {
                if (row != CHAR_MAP[word.charAt(j)]) {
                    skip = true;
                    break;
                }
            }

            if (!skip) {
                result.add(word);
            }
        }

        return result.toArray(String[]::new);
    }
}
