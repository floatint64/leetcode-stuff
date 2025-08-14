package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestOddNumberInStringTest {

    @Test
    void largestOddNumber() {
        LargestOddNumberInString large = new LargestOddNumberInString();

        String num = "52";
        String expected = "5";

        Assertions.assertEquals(expected, large.largestOddNumber(num));
    }

    @Test
    void largestOddNumber2() {
        LargestOddNumberInString large = new LargestOddNumberInString();

        String num = "4206";
        String expected = "";

        Assertions.assertEquals(expected, large.largestOddNumber(num));
    }

    @Test
    void largestOddNumber3() {
        LargestOddNumberInString large = new LargestOddNumberInString();

        String num = "35427";
        String expected = "35427";

        Assertions.assertEquals(expected, large.largestOddNumber(num));
    }

    @Test
    void largestOddNumber4() {
        LargestOddNumberInString large = new LargestOddNumberInString();

        String num = "2";
        String expected = "";

        Assertions.assertEquals(expected, large.largestOddNumber(num));
    }

    @Test
    void largestOddNumber5() {
        LargestOddNumberInString large = new LargestOddNumberInString();

        String num = "7";
        String expected = "7";

        Assertions.assertEquals(expected, large.largestOddNumber(num));
    }

    @Test
    void largestOddNumber6() {
        LargestOddNumberInString large = new LargestOddNumberInString();

        String num = "11112";
        String expected = "1111";

        Assertions.assertEquals(expected, large.largestOddNumber(num));
    }
}