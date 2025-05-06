package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignCookiesTest {

    @Test
    void findContentChildren() {
        AssignCookies assignCookies = new AssignCookies();

        int[] childs = {1, 2, 3};
        int[] cookies = {1, 2};

        Assertions.assertEquals(2, assignCookies.findContentChildren(childs, cookies));
    }

    @Test
    void findContentChildren2() {
        AssignCookies assignCookies = new AssignCookies();

        int[] childs = {1, 2, 3};
        int[] cookies = {1, 1};

        Assertions.assertEquals(1, assignCookies.findContentChildren(childs, cookies));
    }
}