package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultingStringAfterAdjacentRemovalsTest {

    @Test
    void resultingString() {
        ResultingStringAfterAdjacentRemovals result = new ResultingStringAfterAdjacentRemovals();

        String s = "abc";
        String expected = "c";

        Assertions.assertEquals(expected, result.resultingString(s));
    }

    @Test
    void resultingString2() {
        ResultingStringAfterAdjacentRemovals result = new ResultingStringAfterAdjacentRemovals();

        String s = "adcb";
        String expected = "";

        Assertions.assertEquals(expected, result.resultingString(s));
    }

    @Test
    void resultingString3() {
        ResultingStringAfterAdjacentRemovals result = new ResultingStringAfterAdjacentRemovals();

        String s = "zadb";
        String expected = "db";

        Assertions.assertEquals(expected, result.resultingString(s));
    }

    @Test
    void resultingString4() {
        ResultingStringAfterAdjacentRemovals result = new ResultingStringAfterAdjacentRemovals();

        String s = "za";
        String expected = "";

        Assertions.assertEquals(expected, result.resultingString(s));
    }

    @Test
    void resultingString5() {
        ResultingStringAfterAdjacentRemovals result = new ResultingStringAfterAdjacentRemovals();

        String s = "az";
        String expected = "";

        Assertions.assertEquals(expected, result.resultingString(s));
    }

    @Test
    void resultingString6() {
        ResultingStringAfterAdjacentRemovals result = new ResultingStringAfterAdjacentRemovals();

        String s = "abcd";
        String expected = "";

        Assertions.assertEquals(expected, result.resultingString(s));
    }
}