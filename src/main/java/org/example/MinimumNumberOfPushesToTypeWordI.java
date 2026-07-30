package org.example;

public class MinimumNumberOfPushesToTypeWordI {
    public int minimumPushes(String word) {
        var l = word.length();

        int[] cnt = {
                0,
                8,
                24,
                48
        };

        var il = l / 8;
        var ol = l % 8;

        return cnt[il] + ol * (il + 1);
    }
}
