package org.example;

public class WeightedWordMapping {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder(words.length);

        for (var w : words) {
            int ww = 0;
            for (int i = 0; i < w.length();i++) {
                ww += weights[w.charAt(i) - 'a'];
            }
            sb.append((char)('z' - (ww % 26)));
        }

        return sb.toString();
    }
}
