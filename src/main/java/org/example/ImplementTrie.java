package org.example;

public class ImplementTrie {

    private boolean isFinal = false;
    private ImplementTrie[] chars = new  ImplementTrie['z' - 'a' + 1];

    public ImplementTrie() {

    }

    public void insert(String word) {
        insert(word, 0);
    }

    public boolean search(String word) {
        ImplementTrie c = this;
        for (int i = 0; i < word.length() - 1; i++) {
            c = c.chars[word.charAt(i) - 'a'];
            if (c == null) {
                return false;
            }
        }

        c = c.chars[word.charAt(word.length() - 1) - 'a'];

        return c != null && c.isFinal;
    }

    public boolean startsWith(String prefix) {
        ImplementTrie c = this;
        for (int i = 0; i < prefix.length(); i++) {
            c = c.chars[prefix.charAt(i) - 'a'];
            if (c == null) {
                return false;
            }
        }

        return true;
    }

    private void insert(String s, int pos) {
        if (pos >= s.length()) {
            return;
        }

        var c = s.charAt(pos);

        if (chars[c - 'a'] == null) {
            chars[c - 'a'] = new ImplementTrie();
        }

        if (pos == s.length() - 1) {
            chars[c - 'a'].isFinal = true;
        }

        chars[c - 'a'].insert(s, pos + 1);
    }
}
