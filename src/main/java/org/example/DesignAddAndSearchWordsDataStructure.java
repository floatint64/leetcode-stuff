package org.example;

public class DesignAddAndSearchWordsDataStructure {

    private class Trie {
        private class Node {
            final Node[] children = new Node['z' - 'a' + 1];
            boolean isFinal = false;
        }

        Trie() {
        }

        private final Node root = new Node();

        void addWord(String word) {
            Node currNode = root;
            for (int i = 0; i < word.length(); i++) {
                var c  = word.charAt(i) - 'a';
                if (currNode.children[c] == null) {
                    currNode.children[c] = new Node();
                }
                currNode = currNode.children[c];
            }

            currNode.isFinal = true;
        }

        boolean searchWord(String word) {
            return searchWordSub(word, 0, root);
        }

        boolean searchWordSub(String word, int idx, Node root) {
            if (root == null) {
                return false;
            }

            if (idx == word.length() - 1) {
                if (word.charAt(idx) == '.') {
                    for (var nd : root.children) {
                        if (nd != null && nd.isFinal) {
                            return true;
                        }
                    }
                    return false;
                } else {
                    var n = root.children[word.charAt(idx) - 'a'];
                    return n != null && n.isFinal;
                }
            }

            boolean res = false;

            if (word.charAt(idx) != '.') {
                res = searchWordSub(word, idx + 1, root.children[word.charAt(idx) - 'a']);
            } else {
                for (var n : root.children) {
                    res = res || searchWordSub(word, idx + 1, n);
                }
            }

            return res;
        }
    }

    private final Trie trie = new Trie();

    public DesignAddAndSearchWordsDataStructure() {

    }

    public void addWord(String word) {
        trie.addWord(word);
    }

    public boolean search(String word) {
        return trie.searchWord(word);
    }
}
