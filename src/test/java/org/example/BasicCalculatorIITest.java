package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIITest {

    @Test
    void calculate() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "2+2*4";

        Assertions.assertEquals(10, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate2() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "2 +2 * 4";

        Assertions.assertEquals(10, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate3() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "5";

        Assertions.assertEquals(5, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate4() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "5/2";

        Assertions.assertEquals(2, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate5() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "3+2*2";

        Assertions.assertEquals(7, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate6() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = " 3/2 ";

        Assertions.assertEquals(1, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate7() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = " 3+5 / 2 ";

        Assertions.assertEquals(5, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate8() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "  ";

        Assertions.assertEquals(0, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate9() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "1-1+1";

        Assertions.assertEquals(1, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate10() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "2*3+1";

        Assertions.assertEquals(7, basicCalculatorII.calculate(expr));
    }

    @Test
    void calculate11() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        String expr = "1*2-3/4+5*6-7*8+9/10";

        Assertions.assertEquals(-24, basicCalculatorII.calculate(expr));
    }
}