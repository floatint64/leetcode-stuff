package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplementQueueUsingStacksTest {

    @Test
    void implementQueueUsingStacksTest() {
        ImplementQueueUsingStacks implementQueueUsingStacks = new ImplementQueueUsingStacks();
        implementQueueUsingStacks.push(1);
        implementQueueUsingStacks.push(2);
        Assertions.assertEquals(1, implementQueueUsingStacks.peek());
        Assertions.assertEquals(1, implementQueueUsingStacks.peek());
        Assertions.assertEquals(1, implementQueueUsingStacks.pop());
        Assertions.assertFalse(implementQueueUsingStacks.empty());
        Assertions.assertEquals(2, implementQueueUsingStacks.peek());
        Assertions.assertEquals(2, implementQueueUsingStacks.pop());
        Assertions.assertTrue(implementQueueUsingStacks.empty());
    }
}