package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteCharactersToMakeFancyStringTest {

    @Test
    void makeFancyString() {
        DeleteCharactersToMakeFancyString delete = new DeleteCharactersToMakeFancyString();

        String s = "leeetcode";
        String expected = "leetcode";

        Assertions.assertEquals(expected, delete.makeFancyString(s));
    }

    @Test
    void makeFancyString2() {
        DeleteCharactersToMakeFancyString delete = new DeleteCharactersToMakeFancyString();

        String s = "aaabaaaa";
        String expected = "aabaa";

        Assertions.assertEquals(expected, delete.makeFancyString(s));
    }

    @Test
    void makeFancyString3() {
        DeleteCharactersToMakeFancyString delete = new DeleteCharactersToMakeFancyString();

        String s = "aab";
        String expected = "aab";

        Assertions.assertEquals(expected, delete.makeFancyString(s));
    }

    @Test
    void makeFancyString4() {
        DeleteCharactersToMakeFancyString delete = new DeleteCharactersToMakeFancyString();

        String s = "aa";
        String expected = "aa";

        Assertions.assertEquals(expected, delete.makeFancyString(s));
    }

    @Test
    void makeFancyString5() {
        DeleteCharactersToMakeFancyString delete = new DeleteCharactersToMakeFancyString();

        String s = "aaa";
        String expected = "aa";

        Assertions.assertEquals(expected, delete.makeFancyString(s));
    }

    @Test
    void makeFancyString6() {
        DeleteCharactersToMakeFancyString delete = new DeleteCharactersToMakeFancyString();

        String s = "abcdddddddeeeeflllll";
        String expected = "abcddeefll";

        Assertions.assertEquals(expected, delete.makeFancyString(s));
    }
}