package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    void isPalindrome2() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    void isPalindrome3() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertFalse(palindromeNumber.isPalindrome(10));
    }

    @Test
    void isPalindrome4() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertTrue(palindromeNumber.isPalindrome(0));
    }

    @Test
    void isPalindrome5() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertFalse(palindromeNumber.isPalindrome(Integer.MIN_VALUE));
    }

    @Test
    void isPalindrome6() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertFalse(palindromeNumber.isPalindrome(Integer.MAX_VALUE));
    }
}