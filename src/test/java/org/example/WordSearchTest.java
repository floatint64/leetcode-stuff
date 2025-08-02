package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void exist() {
        WordSearch search = new WordSearch();

        String word = "ABCCED";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertTrue(search.exist(board, word));
    }

    @Test
    void exist2() {
        WordSearch search = new WordSearch();

        String word = "SEE";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertTrue(search.exist(board, word));
    }

    @Test
    void exist3() {
        WordSearch search = new WordSearch();

        String word = "ABCB";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertFalse(search.exist(board, word));
    }

    @Test
    void exist4() {
        WordSearch search = new WordSearch();

        String word = "CC";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertTrue(search.exist(board, word));
    }

    @Test
    void exist5() {
        WordSearch search = new WordSearch();

        String word = "CFD";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertTrue(search.exist(board, word));
    }

    @Test
    void exist6() {
        WordSearch search = new WordSearch();

        String word = "E";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertTrue(search.exist(board, word));
    }

    @Test
    void exist7() {
        WordSearch search = new WordSearch();

        String word = "G";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertFalse(search.exist(board, word));
    }

    @Test
    void exist8() {
        WordSearch search = new WordSearch();

        String word = "FCED";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertTrue(search.exist(board, word));
    }

    @Test
    void exist9() {
        WordSearch search = new WordSearch();

        String word = "ABCED";

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        Assertions.assertFalse(search.exist(board, word));
    }

    @Test
    void exist10() {
        WordSearch search = new WordSearch();

        String word = "a";

        char[][] board = {
                {'a'}
        };

        Assertions.assertTrue(search.exist(board, word));
    }

    @Test
    void exist11() {
        WordSearch search = new WordSearch();

        String word = "aaaaaaaaaaaaa";

        char[][] board = {
                {'a','a','a','a'},
                {'a','a','a','a'},
                {'a','a','a','a'}
        };

        Assertions.assertFalse(search.exist(board, word));
    }

    @Test
    void exist12() {
        WordSearch search = new WordSearch();

        String word = "bbbaabbbbbab";

        char[][] board = {
                {'a','a','b','a','a','b'},
                {'a','a','b','b','b','a'},
                {'a','a','a','a','b','a'},
                {'b','a','b','b','a','b'},
                {'a','b','b','a','b','a'},
                {'b','a','a','a','a','b'}
        };

        Assertions.assertFalse(search.exist(board, word));
    }
}