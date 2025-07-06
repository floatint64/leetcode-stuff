package org.example;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        int[] count = new int['z' + 1];

        for (int i = 0; i < chars.length; i++) {
            count[chars[i]]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (count[chars[i]] == 1) {
                return i;
            }
        }

        return -1;
    }
}
