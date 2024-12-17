package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";

        Assertions.assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindrome2() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        String s = "race a car";

        Assertions.assertFalse(validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindrome3() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        String s = " ";

        Assertions.assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindrome4() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        String s = "aboba";

        Assertions.assertTrue(validPalindrome.isPalindrome(s));
    }
}