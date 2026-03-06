package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {

    @Test
    void checkOnesSegment() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "1001";
        boolean expected = false;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment2() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "0110";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment3() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "0011";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment4() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "1111";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment5() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "0111";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment6() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "1";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment7() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "0";
        boolean expected = false;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment8() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "10";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment9() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "01";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment10() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "1100111";
        boolean expected = false;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment11() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "0011100";
        boolean expected = true;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }

    @Test
    void checkOnesSegment12() {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes c = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "000011100011111100";
        boolean expected = false;

        Assertions.assertEquals(expected, c.checkOnesSegment(s));
    }
}