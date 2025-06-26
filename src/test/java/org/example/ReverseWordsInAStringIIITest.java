package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringIIITest {

    @Test
    void reverseWords() {
        ReverseWordsInAStringIII rev = new ReverseWordsInAStringIII();

        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";

        Assertions.assertEquals(expected, rev.reverseWords(s));
    }

    @Test
    void reverseWords2() {
        ReverseWordsInAStringIII rev = new ReverseWordsInAStringIII();

        String s = "Mr Ding";
        String expected = "rM gniD";

        Assertions.assertEquals(expected, rev.reverseWords(s));
    }

    @Test
    void reverseWords3() {
        ReverseWordsInAStringIII rev = new ReverseWordsInAStringIII();

        String s = "MrDing";
        String expected = "gniDrM";

        Assertions.assertEquals(expected, rev.reverseWords(s));
    }

    @Test
    void reverseWords4() {
        ReverseWordsInAStringIII rev = new ReverseWordsInAStringIII();

        String s = "M A R S";
        String expected = "M A R S";

        Assertions.assertEquals(expected, rev.reverseWords(s));
    }

    @Test
    void reverseWords5() {
        ReverseWordsInAStringIII rev = new ReverseWordsInAStringIII();

        String s = "fa ke ke fa";
        String expected = "af ek ek af";

        Assertions.assertEquals(expected, rev.reverseWords(s));
    }
}