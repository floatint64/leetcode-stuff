package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {

        ValidParentheses validParentheses = new ValidParentheses();

        String s = "()[]{}";

        Assertions.assertTrue(validParentheses.isValid(s));
    }

    @Test
    void isValid2() {

        ValidParentheses validParentheses = new ValidParentheses();

        String s = "(]";

        Assertions.assertFalse(validParentheses.isValid(s));
    }

    @Test
    void isValid3() {

        ValidParentheses validParentheses = new ValidParentheses();

        String s = "([])";

        Assertions.assertTrue(validParentheses.isValid(s));
    }

    @Test
    void isValid4() {

        ValidParentheses validParentheses = new ValidParentheses();

        String s = "([)]";

        Assertions.assertFalse(validParentheses.isValid(s));
    }
}