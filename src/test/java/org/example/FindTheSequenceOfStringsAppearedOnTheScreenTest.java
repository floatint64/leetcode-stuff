package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTheSequenceOfStringsAppearedOnTheScreenTest {

    @Test
    void stringSequence() {
        FindTheSequenceOfStringsAppearedOnTheScreen find = new FindTheSequenceOfStringsAppearedOnTheScreen();

        String target = "abc";

        var expected = List.of("a","aa","ab","aba","abb","abc");

        Assertions.assertEquals(expected, find.stringSequence(target));
    }

    @Test
    void stringSequence2() {
        FindTheSequenceOfStringsAppearedOnTheScreen find = new FindTheSequenceOfStringsAppearedOnTheScreen();

        String target = "he";

        var expected = List.of("a","b","c","d","e","f","g","h","ha","hb","hc","hd","he");

        Assertions.assertEquals(expected, find.stringSequence(target));
    }

    @Test
    void stringSequence3() {
        FindTheSequenceOfStringsAppearedOnTheScreen find = new FindTheSequenceOfStringsAppearedOnTheScreen();

        String target = "a";

        var expected = List.of("a");

        Assertions.assertEquals(expected, find.stringSequence(target));
    }

    @Test
    void stringSequence4() {
        FindTheSequenceOfStringsAppearedOnTheScreen find = new FindTheSequenceOfStringsAppearedOnTheScreen();

        String target = "aaa";

        var expected = List.of("a","aa","aaa");

        Assertions.assertEquals(expected, find.stringSequence(target));
    }

    @Test
    void stringSequence5() {
        FindTheSequenceOfStringsAppearedOnTheScreen find = new FindTheSequenceOfStringsAppearedOnTheScreen();

        String target = "z";

        var expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        Assertions.assertEquals(expected, find.stringSequence(target));
    }

    @Test
    void stringSequence6() {
        FindTheSequenceOfStringsAppearedOnTheScreen find = new FindTheSequenceOfStringsAppearedOnTheScreen();

        String target = "yb";

        var expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "ya", "yb");

        Assertions.assertEquals(expected, find.stringSequence(target));
    }
}