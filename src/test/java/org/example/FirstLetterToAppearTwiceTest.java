package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLetterToAppearTwiceTest {

    @Test
    void repeatedCharacter() {
        FirstLetterToAppearTwice first = new FirstLetterToAppearTwice();

        String s = "abccbaacz";

        Assertions.assertEquals('c', first.repeatedCharacter(s));
    }

    @Test
    void repeatedCharacter2() {
        FirstLetterToAppearTwice first = new FirstLetterToAppearTwice();

        String s = "abcdd";

        Assertions.assertEquals('d', first.repeatedCharacter(s));
    }
}