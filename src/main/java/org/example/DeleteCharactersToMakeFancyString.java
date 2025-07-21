package org.example;

public class DeleteCharactersToMakeFancyString {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.length());

        int i = 0;
        int lastCharCnt = 0;
        char prevChar = 0;

        while (i < s.length()) {

            if (s.charAt(i) == prevChar && lastCharCnt < 2) {
                sb.append(s.charAt(i));
                lastCharCnt++;
            } else if (s.charAt(i) != prevChar){
                sb.append(s.charAt(i));
                lastCharCnt = 1;
            }
            prevChar = s.charAt(i);
            i++;
        }

        return sb.toString();
    }
}
