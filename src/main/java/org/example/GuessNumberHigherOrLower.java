package org.example;

public class GuessNumberHigherOrLower {
    private final int n;

    public GuessNumberHigherOrLower(int n) {
        this.n = n;
    }

    private int guess(int num) {
        if (num == n) {
            return 0;
        }

        if (num > n) {
            return -1;
        }

        return 1;
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (true) {
            int m = l + ((r - l) / 2);
            int res = guess(m);
            switch (res) {
                case 0 -> {return m;}
                case -1 -> r = m - 1;
                case 1 -> l = m + 1;
            }
        }
    }
}
