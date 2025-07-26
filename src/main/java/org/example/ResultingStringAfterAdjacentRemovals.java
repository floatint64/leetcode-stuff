package org.example;

public class ResultingStringAfterAdjacentRemovals {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (sb.length() > 0) {
                char c = sb.charAt(sb.length() - 1);
                int cCode = c - 'a';
                char l = (char)((cCode - 1 < 0 ? 'z' - 'a' : cCode - 1) % 26 + 'a');
                char r = (char)((cCode + 1) % 26 + 'a');
                if (l == s.charAt(i) || r == s.charAt(i)) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
