package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {

    @Test
    void multiply() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "111";
        String num2 = "111";

        Assertions.assertEquals("12321", ms.multiply(num1, num2));
    }

    @Test
    void multiply2() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "99";
        String num2 = "99";

        Assertions.assertEquals("9801", ms.multiply(num1, num2));
    }

    @Test
    void multiply3() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "2";
        String num2 = "3";

        Assertions.assertEquals("6", ms.multiply(num1, num2));
    }

    @Test
    void multiply4() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "123";
        String num2 = "456";

        Assertions.assertEquals("56088", ms.multiply(num1, num2));
    }

    @Test
    void multiply5() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "45345";
        String num2 = "67675";

        Assertions.assertEquals("3068722875", ms.multiply(num1, num2));
    }

    @Test
    void multiply6() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "0";
        String num2 = "0";

        Assertions.assertEquals("0", ms.multiply(num1, num2));
    }

    @Test
    void multiply7() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "0";
        String num2 = "1";

        Assertions.assertEquals("0", ms.multiply(num1, num2));
    }

    @Test
    void multiply8() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "100";
        String num2 = "0";

        Assertions.assertEquals("0", ms.multiply(num1, num2));
    }

    @Test
    void multiply9() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "0";
        String num2 = "110";

        Assertions.assertEquals("0", ms.multiply(num1, num2));
    }

    @Test
    void multiply10() {

        MultiplyStrings ms = new MultiplyStrings();

        String num1 = "100";
        String num2 = "100";

        Assertions.assertEquals("10000", ms.multiply(num1, num2));
    }
}