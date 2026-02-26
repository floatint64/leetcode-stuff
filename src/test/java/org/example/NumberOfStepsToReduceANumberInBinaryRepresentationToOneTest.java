package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceANumberInBinaryRepresentationToOneTest {

    @Test
    void numSteps() {
        NumberOfStepsToReduceANumberInBinaryRepresentationToOne n = new NumberOfStepsToReduceANumberInBinaryRepresentationToOne();

        String s = "1101";
        int expected = 6;

        Assertions.assertEquals(expected, n.numSteps(s));
    }

    @Test
    void numSteps2() {
        NumberOfStepsToReduceANumberInBinaryRepresentationToOne n = new NumberOfStepsToReduceANumberInBinaryRepresentationToOne();

        String s = "10";
        int expected = 1;

        Assertions.assertEquals(expected, n.numSteps(s));
    }

    @Test
    void numSteps3() {
        NumberOfStepsToReduceANumberInBinaryRepresentationToOne n = new NumberOfStepsToReduceANumberInBinaryRepresentationToOne();

        String s = "101";
        int expected = 5;

        Assertions.assertEquals(expected, n.numSteps(s));
    }

    @Test
    void numSteps4() {
        NumberOfStepsToReduceANumberInBinaryRepresentationToOne n = new NumberOfStepsToReduceANumberInBinaryRepresentationToOne();

        String s = "1";
        int expected = 0;

        Assertions.assertEquals(expected, n.numSteps(s));
    }


    @Test
    void numSteps5() {
        NumberOfStepsToReduceANumberInBinaryRepresentationToOne n = new NumberOfStepsToReduceANumberInBinaryRepresentationToOne();

        String s = "11001";
        int expected = 8;

        Assertions.assertEquals(expected, n.numSteps(s));
    }
}