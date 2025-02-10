package org.example;

import org.example.common.ListInteger;
import org.example.common.NestedInteger;
import org.example.common.SimpleInteger;

import java.util.Deque;
import java.util.LinkedList;

public class MiniParser {
    public NestedInteger deserialize(String s) {
        Deque<NestedInteger> stack = new LinkedList<>();

        int i = 0;

        while (i < s.length()) {
            int intLen = 0;
            while (i < s.length() && ('0' <= s.charAt(i) && s.charAt(i) <= '9' || s.charAt(i) == '-')) {
                intLen++;
                i++;
            }
            if (intLen > 0) {
                int intVal = Integer.parseInt(s, i - intLen, i, 10);
                if (!stack.isEmpty()) {
                    NestedInteger root = stack.peek();
                    root.add(new SimpleInteger(intVal));
                } else {
                    stack.push(new SimpleInteger(intVal));
                }
                continue;
            }

            if (s.charAt(i) == '[') {
                NestedInteger subList = new ListInteger();
                if (!stack.isEmpty()) {
                    NestedInteger root = stack.peek();
                    root.add(subList);
                }
                stack.push(subList);
            }

            if (s.charAt(i) == ']') {
                if (stack.size() > 1) {
                    stack.pop();
                }
            }

            i++;
        }

        return stack.pop();
    }
}
