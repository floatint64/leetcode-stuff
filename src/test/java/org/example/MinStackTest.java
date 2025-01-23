package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void minStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        Assertions.assertEquals(-2, minStack.getMin());
        Assertions.assertEquals(-1, minStack.top());
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }
}