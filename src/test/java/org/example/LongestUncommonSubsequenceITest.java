package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestUncommonSubsequenceITest {

    @Test
    void findLUSlength() {
        LongestUncommonSubsequenceI longest = new LongestUncommonSubsequenceI();

        String a = "aba";
        String b = "cdc";
        int expected = 3;

        Assertions.assertEquals(expected, longest.findLUSlength(a,b));
    }

    @Test
    void findLUSlength2() {
        LongestUncommonSubsequenceI longest = new LongestUncommonSubsequenceI();

        String a = "aaa";
        String b = "aaa";
        int expected = -1;

        Assertions.assertEquals(expected, longest.findLUSlength(a,b));
    }

    @Test
    void findLUSlength3() {
        LongestUncommonSubsequenceI longest = new LongestUncommonSubsequenceI();

        String a = "aaa";
        String b = "bbb";
        int expected = 3;

        Assertions.assertEquals(expected, longest.findLUSlength(a,b));
    }

    @Test
    void findLUSlengt4() {
        LongestUncommonSubsequenceI longest = new LongestUncommonSubsequenceI();

        String a = "abac";
        String b = "cdca";
        int expected = 4;

        Assertions.assertEquals(expected, longest.findLUSlength(a,b));
    }

    @Test
    void findLUSlengt5() {
        LongestUncommonSubsequenceI longest = new LongestUncommonSubsequenceI();

        String a = "aefawfawfawfaw";
        String b = "aefawfeawfwafwaef";
        int expected = 17;

        Assertions.assertEquals(expected, longest.findLUSlength(a,b));
    }
}