package org.example;

public class ReverseVowelsOfAString {
    private static final boolean[] VOWELS = new boolean['z' + 1];

    static {
        VOWELS['a'] = true;
        VOWELS['e'] = true;
        VOWELS['i'] = true;
        VOWELS['o'] = true;
        VOWELS['u'] = true;
        VOWELS['A'] = true;
        VOWELS['E'] = true;
        VOWELS['I'] = true;
        VOWELS['O'] = true;
        VOWELS['U'] = true;
    }
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (!VOWELS[chars[l]]) {
                l++;
                continue;
            }

            if (!VOWELS[chars[r]]) {
                r--;
                continue;
            }

            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            l++;
            r--;
        }

        return String.valueOf(chars);
    }
}
