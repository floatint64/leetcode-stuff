package org.example;

public class ImplementMagicDictionary {
    static class Trie {

        private boolean[][] trieMatrix = new boolean[101][25];
        private int currentLevel = 0;

        Trie() {
        }

        public void add(String s) {
            char[] chrs = s.toCharArray();
            currentLevel = Math.max(currentLevel, chrs.length);

            for (int i = 0; i < chrs.length; i++) {
                trieMatrix[i][chrs[i] - 'a'] = true;
            }
        }

        int search(String s, int errorLimit) {
            char[] chrs = s.toCharArray();
            int missLenError = chrs.length > currentLevel ? chrs.length - currentLevel : 0;
            int i = 0;
            int errors = 0;

            while (i < chrs.length && errors < errorLimit) {
                errors += trieMatrix[i][chrs[i++] - 'a'] ? 0 : 1;
                errors += missLenError;
            }

            return errors;
        }
    }

    private final Trie trie = new Trie();

    public ImplementMagicDictionary() {
    }

    public void buildDict(String[] dictionary) {
        for (String s : dictionary) {
            trie.add(s);
        }
    }

    public boolean search(String searchWord) {
        int errors = trie.search(searchWord, 2);
        return errors != 0 && errors < 2;
    }
}
