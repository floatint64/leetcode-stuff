package org.example;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] sr = new int['z' + 1];
        int[] tr = new int['z' + 1];

        for (int i = 0; i < s.length(); i++) {
            sr[s.charAt(i)]++;
            tr[t.charAt(i)]++;
        }

        tr[t.charAt(t.length() - 1)]++;

        for (char i = 'a'; i <= 'z'; i++) {
            if (sr[i] != tr[i]) {
                return i;
            }
        }
        return '\0';
    }
}
