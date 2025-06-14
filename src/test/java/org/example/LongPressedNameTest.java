package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongPressedNameTest {

    @Test
    void isLongPressedName() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "alex";
        String typed = "aalleexx";

        Assertions.assertTrue(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName2() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "alex";
        String typed = "aaleex";

        Assertions.assertTrue(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName3() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "saeed";
        String typed = "ssaaedd";

        Assertions.assertFalse(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName4() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "pick";
        String typed = "kek";

        Assertions.assertFalse(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName5() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "pick";
        String typed = "piiiiiick";

        Assertions.assertTrue(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName6() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "pick";
        String typed = "piiiiiickkkkkkk";

        Assertions.assertTrue(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName7() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "pick";
        String typed = "picks";

        Assertions.assertFalse(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName8() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "vtkgn";
        String typed = "vttkgnn";

        Assertions.assertTrue(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName9() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "alex";
        String typed = "aaleexa";

        Assertions.assertFalse(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName10() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "a";
        String typed = "b";

        Assertions.assertFalse(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName11() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "leelee";
        String typed = "lleeelee";

        Assertions.assertTrue(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName12() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "aabbobaaa";
        String typed = "aaabbbbooobaaa";

        Assertions.assertTrue(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName13() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "alexd";
        String typed = "ale";

        Assertions.assertFalse(longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName14() {
        LongPressedName longPressedName = new LongPressedName();

        String name = "alex";
        String typed = "alexxr";

        Assertions.assertFalse(longPressedName.isLongPressedName(name, typed));
    }
}