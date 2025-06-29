package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringIITest {

    @Test
    void reverseStr() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "abcdefg";
        int k = 2;

        Assertions.assertEquals("bacdfeg", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr2() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "abcd";
        int k = 2;

        Assertions.assertEquals("bacd", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr3() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "abcdkeksvik";
        int k = 2;

        Assertions.assertEquals("bacdekksivk", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr4() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "abcdkeksvi";
        int k = 2;

        Assertions.assertEquals("bacdekksiv", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr5() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "abcdkeksvika";
        int k = 2;

        Assertions.assertEquals("bacdekksivka", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr6() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "abcdkeksvikam";
        int k = 2;

        Assertions.assertEquals("bacdekksivkam", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr7() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "apofismikkie";
        int k = 3;

        Assertions.assertEquals("opafiskimkie", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr8() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "apofismikkieol";
        int k = 3;

        Assertions.assertEquals("opafiskimkielo", reverse.reverseStr(s, k));
    }

    @Test
    void reverseStr9() {
        ReverseStringII reverse = new ReverseStringII();

        String s = "apofismikkieo";
        int k = 3;

        Assertions.assertEquals("opafiskimkieo", reverse.reverseStr(s, k));
    }
}