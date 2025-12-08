package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int n = 3;
        var expected = List.of(
                "1","2","Fizz"
        );

        Assertions.assertEquals(expected, fizzBuzz.fizzBuzz(n));
    }

    @Test
    void fizzBuzz2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int n = 5;
        var expected = List.of(
                "1","2","Fizz","4","Buzz"
        );

        Assertions.assertEquals(expected, fizzBuzz.fizzBuzz(n));
    }

    @Test
    void fizzBuzz3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int n = 15;
        var expected = List.of(
                "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"
        );

        Assertions.assertEquals(expected, fizzBuzz.fizzBuzz(n));
    }
}