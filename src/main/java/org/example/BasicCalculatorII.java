package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BiFunction;

public class BasicCalculatorII {

    public static int[] ops = new int[8];

    static {
        ops[2] = 0;
        ops[3] = 1;
        ops[5] = 1;
        ops[7] = 0;
    }

    public int calculate(String s) {
        Queue<Integer> rpn = new LinkedList<>();
        Deque<Integer> operatorsStack = new LinkedList<>();

        // build rpn

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
                    pickedOperator = -pickedOperator;
                    if (ops[pickedOperator] < ops[chr % 40]) {
                        rpn.addAll(operatorsStack);
                        operatorsStack.clear();
                    } else if (ops[pickedOperator] == ops[chr % 40]) {
                        rpn.add(operatorsStack.pop());
                    }
                }
                operatorsStack.push(-(chr % 40));
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

            if (operandLen > 0) {
                rpn.add(Integer.parseInt(s, i - operandLen, i, 10));
            }
        }

        rpn.addAll(operatorsStack);

        Stack<Integer> operandsStack = new Stack<>();

        while (!rpn.isEmpty()) {
            var peeked = rpn.peek();
            if (peeked < 0) {
                var b = operandsStack.pop();
                var a = operandsStack.pop();
                switch (-peeked) {
                    case 2:
                        operandsStack.push(a * b);
                        break;
                    case 3:
                        operandsStack.push(a + b);
                        break;
                    case 5:
                        operandsStack.push(a - b);
                        break;
                    case 7:
                        operandsStack.push(a / b);
                        break;
                }

                rpn.poll();
            } else {
                operandsStack.push(rpn.poll());
            }
        }

        return operandsStack.isEmpty() ? 0 : operandsStack.pop();
    }
}
