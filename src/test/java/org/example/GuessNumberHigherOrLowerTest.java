package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    @Test
    void guessNumber() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(6);

        Assertions.assertEquals(6, guess.guessNumber(10));
    }

    @Test
    void guessNumber2() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(1);

        Assertions.assertEquals(1, guess.guessNumber(1));
    }

    @Test
    void guessNumber3() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(1);

        Assertions.assertEquals(1, guess.guessNumber(2));
    }

    @Test
    void guessNumber4() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(177);

        Assertions.assertEquals(177, guess.guessNumber(200));
    }

    @Test
    void guessNumber5() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(333);

        Assertions.assertEquals(333, guess.guessNumber(333));
    }

    @Test
    void guessNumber6() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(1);

        Assertions.assertEquals(1, guess.guessNumber(4561));
    }
}