package org.example;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        char[] src = s.toCharArray();

        boolean[] visited = new boolean['z' + 1];

        for (char c : src) {
            if (visited[c]) {
                return c;
            }
            visited[c] = true;
        }

        return 'a';
    }
}
