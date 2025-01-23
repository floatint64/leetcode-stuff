package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.BiFunction;

public class BasicCalculatorII {
    private final BiFunction<Integer, Integer, Integer>[] functions = (BiFunction<Integer, Integer, Integer>[]) new BiFunction[8];
    private final int[] opPriority = new int[8];

    public BasicCalculatorII() {
        functions[2] = (a, b) -> a * b;
        functions[3] = (a, b) -> a + b;
        functions[5] = (a, b) -> a - b;
        functions[7] = (a, b) -> a / b;
        opPriority[2] = 1;
        opPriority[3] = 2;
        opPriority[5] = 2;
        opPriority[7] = 1;
    }

    public int calculate(String s) {
        Deque<Integer> operandsStack = new LinkedList<>();
        Deque<Character> operatorsStack = new LinkedList<>();

        int n = s.length();

        int i = 0;

        while (i < n) {
            char chr = s.charAt(i);
            if (chr == ' ') {
                i++;
                continue;
            }

            if (chr == '+' || chr == '-' || chr == '*' || chr == '/') {
                if (!operatorsStack.isEmpty()) {
                    var pickedOperator = operatorsStack.peek();
                    if (opPriority[pickedOperator % 40] < opPriority[chr % 40] || opPriority[pickedOperator % 40] == opPriority[chr % 40]) {
                        pickedOperator = operatorsStack.pop();
                        int r = operandsStack.pop();
                        int l = operandsStack.pop();
                        operandsStack.push(functions[pickedOperator % 40].apply(l, r));
                    }
                }
                operatorsStack.push(chr);
                i++;
                continue;
            }

            int operandLen = 0;
            while ('0' <= chr && chr <= '9') {
                operandLen++;
                i++;
                if (i > n - 1) {
                    break;
                }
                chr = s.charAt(i);
            }

            if (operandLen > 0)
                operandsStack.push(Integer.parseInt(s, i - operandLen, i, 10));
        }

        while (!operatorsStack.isEmpty()) {
            int right = operandsStack.pop();
            int left = operandsStack.pop();
            char op = operatorsStack.pop();
            operandsStack.push(functions[op % 40].apply(left, right));
        }

        return operandsStack.isEmpty() ? 0 : operandsStack.pop();
    }
}
