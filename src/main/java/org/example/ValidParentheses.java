package org.example;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean isValid(String s) {

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                Character lastC = stack.peek();
                if (lastC != null) {
                    if (lastC == '(' && c == ')') {
                        stack.pop();
                    } else if (lastC == '[' && c == ']') {
                        stack.pop();
                    } else if (lastC == '{' && c == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
