package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void evalRPN() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

        String[] tokens = {"2","1","+","3","*"};

        Assertions.assertEquals(9, evaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void evalRPN2() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

        String[] tokens = {"4","13","5","/","+"};

        Assertions.assertEquals(6, evaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void evalRPN3() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        Assertions.assertEquals(22, evaluateReversePolishNotation.evalRPN(tokens));
    }
}