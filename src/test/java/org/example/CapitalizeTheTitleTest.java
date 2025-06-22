package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTheTitleTest {

    @Test
    void capitalizeTitle() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "capiTalIze tHe titLe";

        Assertions.assertEquals("Capitalize The Title", cap.capitalizeTitle(s));
    }

    @Test
    void capitalizeTitle2() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "First leTTeR of EACH Word";

        Assertions.assertEquals("First Letter of Each Word", cap.capitalizeTitle(s));
    }

    @Test
    void capitalizeTitle3() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "i lOve leetcode";

        Assertions.assertEquals("i Love Leetcode", cap.capitalizeTitle(s));
    }

    @Test
    void capitalizeTitle4() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "i";

        Assertions.assertEquals("i", cap.capitalizeTitle(s));
    }

    @Test
    void capitalizeTitle5() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "I";

        Assertions.assertEquals("i", cap.capitalizeTitle(s));
    }

    @Test
    void capitalizeTitle6() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "i love DE ep PEEK";

        Assertions.assertEquals("i Love de ep Peek", cap.capitalizeTitle(s));
    }

    @Test
    void capitalizeTitle7() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "DEER bear";

        Assertions.assertEquals("Deer Bear", cap.capitalizeTitle(s));
    }

    @Test
    void capitalizeTitle8() {
        CapitalizeTheTitle cap = new CapitalizeTheTitle();

        String s = "DEER";

        Assertions.assertEquals("Deer", cap.capitalizeTitle(s));
    }
}