package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {

    @Test
    void findTheDifference() {
        FindTheDifference findTheDifference = new FindTheDifference();

        String s = "abcd";
        String t = "cdbea";

        Assertions.assertEquals('e', findTheDifference.findTheDifference(s, t));
    }

    @Test
    void findTheDifference2() {
        FindTheDifference findTheDifference = new FindTheDifference();

        String s = "";
        String t = "y";

        Assertions.assertEquals('y', findTheDifference.findTheDifference(s, t));
    }

    @Test
    void findTheDifference3() {
        FindTheDifference findTheDifference = new FindTheDifference();

        String s = "differt";
        String t = "erfifdtu";

        Assertions.assertEquals('u', findTheDifference.findTheDifference(s, t));
    }

    @Test
    void findTheDifference4() {
        FindTheDifference findTheDifference = new FindTheDifference();

        String s = "a";
        String t = "aa";

        Assertions.assertEquals('a', findTheDifference.findTheDifference(s, t));
    }
}