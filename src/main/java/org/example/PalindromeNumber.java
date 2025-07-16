package org.example;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        long result = 0;
        int target = x;
        while (x != 0 ) {
            long mod = x % 10;
            result = result * 10 + mod;
            x /= 10;
        }

        return result == (long)target;
    }
}
