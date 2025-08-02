package org.example;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board.length * board[0].length < word.length()) {
            return false;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int y = 0; y < board.length; y++) {
            for (int x  = 0; x < board[0].length; x++) {
                var res = dfs(board, visited, word, 0, y, x);
                if (res) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] boards, boolean[][] visited, String word, int i, int y, int x) {
        if (i >= word.length()) {
            return true;
        }

        if (y < 0 || y >= boards.length || x < 0 || x >= boards[0].length) {
            return false;
        }

        var res = !visited[y][x] && boards[y][x] == word.charAt(i);

        if (res) {
            visited[y][x] = true;
        }

        res =  res && (
                dfs(boards, visited, word, i + 1, y - 1, x) ||
                dfs(boards, visited, word, i + 1, y + 1, x) ||
                dfs(boards, visited, word, i + 1, y, x - 1) ||
                dfs(boards, visited, word, i + 1, y, x + 1)
        );

        if (!res) {
            visited[y][x] = false;
        }

        return res;
    }
}
