package org.example;

public class ImplementQueueUsingStacks {
    private final java.util.LinkedList<Integer> first = new java.util.LinkedList<Integer>();
    private final java.util.LinkedList<Integer> second = new java.util.LinkedList<Integer>();

    public ImplementQueueUsingStacks() {

    }

    public void push(int x) {
        while (first.size() > 0) {
            second.push(first.pop());
        }
        first.push(x);
        while (second.size() > 0) {
            first.push(second.pop());
        }
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peekFirst();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
