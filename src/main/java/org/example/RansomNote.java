package org.example;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cache = new int['z' + 1];

        for (var m : magazine.toCharArray()) {
            cache[m]++;
        }

        for (var c : ransomNote.toCharArray()) {
            if (cache[c] < 1) {
                return false;
            } else {
                cache[c]--;
            }
        }

        return true;
    }
}
