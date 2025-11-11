package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @Test
    void fib() {
        FibonacciNumber fib = new FibonacciNumber();

        Assertions.assertEquals(1, fib.fib(2));
    }

    @Test
    void fib2() {
        FibonacciNumber fib = new FibonacciNumber();

        Assertions.assertEquals(2, fib.fib(3));
    }

    @Test
    void fib3() {
        FibonacciNumber fib = new FibonacciNumber();

        Assertions.assertEquals(3, fib.fib(4));
    }
}