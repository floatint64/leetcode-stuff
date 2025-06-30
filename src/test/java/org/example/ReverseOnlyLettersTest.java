package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOnlyLettersTest {

    @Test
    void reverseOnlyLetters() {
        ReverseOnlyLetters rev = new ReverseOnlyLetters();

        String s = "ab-cd";
        String expected = "dc-ba";

        Assertions.assertEquals(expected, rev.reverseOnlyLetters(s));
    }

    @Test
    void reverseOnlyLetters2() {
        ReverseOnlyLetters rev = new ReverseOnlyLetters();

        String s = "a-bC-dEf-ghIj";
        String expected = "j-Ih-gfE-dCba";

        Assertions.assertEquals(expected, rev.reverseOnlyLetters(s));
    }

    @Test
    void reverseOnlyLetters3() {
        ReverseOnlyLetters rev = new ReverseOnlyLetters();

        String s = "Test1ng-Leet=code-Q!";
        String expected = "Qedo1ct-eeLg=ntse-T!";

        Assertions.assertEquals(expected, rev.reverseOnlyLetters(s));
    }
}