package org.example;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BinaryOperator;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> operands = new LinkedList<>();
        Map<String, BinaryOperator<Integer>> operatorsMap = new HashMap<>();
        operatorsMap.put("+", Integer::sum);
        operatorsMap.put("-", (a, b) -> a - b);
        operatorsMap.put("*", (a, b) -> a * b);
        operatorsMap.put("/", (a, b) -> a / b);

        for (var t : tokens) {
            var operator = operatorsMap.get(t);
            if (operator != null) {
                var b = operands.pop();
                var a = operands.pop();
                var res = operator.apply(a, b);
                operands.push(res);
            } else {
                operands.push(Integer.parseInt(t));
            }
        }

        return operands.pop();
    }
}
