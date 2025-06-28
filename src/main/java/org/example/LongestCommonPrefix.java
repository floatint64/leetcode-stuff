package org.example;

public class LongestCommonPrefix {
    private static class Trie {
        private static class TrieNode {
            TrieNode[] children;
            int pathCount;
            int nextNodeWithMaxPath;

            public TrieNode() {
                children = new TrieNode[26];
                pathCount = 0;
                nextNodeWithMaxPath = -1;
            }

            public void getPrefix(StringBuilder sb, int wordCount) {
                if (nextNodeWithMaxPath >= 0 && children[nextNodeWithMaxPath].pathCount >= wordCount) {
                    sb.append((char)(nextNodeWithMaxPath + 'a'));
                    children[nextNodeWithMaxPath].getPrefix(sb, wordCount);
                }
            }

            public void insert(char[] s, int start) {
                if (start < s.length) {
                    var c = s[start] - 'a';
                    if (children[c] == null) {
                        children[c] = new TrieNode();
                    }
                    children[c].pathCount++;

                    if (nextNodeWithMaxPath < 0 || children[c].pathCount > children[nextNodeWithMaxPath].pathCount) {
                        nextNodeWithMaxPath = c;
                    }
                    children[c].insert(s, start + 1);
                }
            }
        }

        private final TrieNode root = new TrieNode();

        public void insert(char[] s, int start) {
            root.insert(s, start);
        }

        public String commonPrefix(int wordsCount) {
            StringBuilder sb = new StringBuilder();
            root.getPrefix(sb, wordsCount);
            return sb.toString();
        }
    }

    private final Trie trie = new Trie();

    public String longestCommonPrefix(String[] strs) {
        for (var s : strs) {
            trie.insert(s.toCharArray(), 0);
        }

        return trie.commonPrefix(strs.length);
    }
}
