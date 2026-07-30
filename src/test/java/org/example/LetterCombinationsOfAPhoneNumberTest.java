package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {

    @Test
    void letterCombinations() {
        LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();

        var digits = "23";
        var expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");

        Assertions.assertEquals(expected, l.letterCombinations(digits));
    }

    @Test
    void letterCombinations2() {
        LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();

        var digits = "2";
        var expected = List.of("a", "b", "c");

        Assertions.assertEquals(expected, l.letterCombinations(digits));
    }

    @Test
    void letterCombinations3() {
        LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();

        var digits = "239";
        var expected = List.of("adw", "adx", "ady", "adz", "aew", "aex", "aey", "aez", "afw", "afx", "afy", "afz", "bdw", "bdx", "bdy", "bdz", "bew", "bex", "bey", "bez", "bfw", "bfx", "bfy", "bfz", "cdw", "cdx", "cdy", "cdz", "cew", "cex", "cey", "cez", "cfw", "cfx", "cfy", "cfz");

        Assertions.assertEquals(expected, l.letterCombinations(digits));
    }
}