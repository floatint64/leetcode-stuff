package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMoneyInLeetcodeBankTest {

    @Test
    void totalMoney() {
        CalculateMoneyInLeetcodeBank calc = new CalculateMoneyInLeetcodeBank();

        int n = 4;

        Assertions.assertEquals(10, calc.totalMoney(n));
    }

    @Test
    void totalMoney2() {
        CalculateMoneyInLeetcodeBank calc = new CalculateMoneyInLeetcodeBank();

        int n = 10;

        Assertions.assertEquals(37, calc.totalMoney(n));
    }

    @Test
    void totalMoney3() {
        CalculateMoneyInLeetcodeBank calc = new CalculateMoneyInLeetcodeBank();

        int n = 20;

        Assertions.assertEquals(96, calc.totalMoney(n));
    }

    @Test
    void totalMoney4() {
        CalculateMoneyInLeetcodeBank calc = new CalculateMoneyInLeetcodeBank();

        int n = 1;

        Assertions.assertEquals(1, calc.totalMoney(n));
    }
}