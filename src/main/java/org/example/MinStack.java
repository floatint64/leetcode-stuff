package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class MinStack {
    private final Deque<Map.Entry<Integer, Integer>> stack = new LinkedList<>();
    private Integer currMin = Integer.MAX_VALUE;

    public MinStack() {
    }

    public void push(int val) {
        currMin = Math.min(val, currMin);
        stack.push(Map.entry(val, currMin));
    }

    public void pop() {
        stack.pop();
        if (stack.isEmpty()) {
            currMin = Integer.MAX_VALUE;
        } else {
            var picked = stack.peek();
            currMin = picked.getValue();
        }
    }

    public int top() {
        return stack.peek().getKey();
    }

    public int getMin() {
        return currMin;
    }
}
