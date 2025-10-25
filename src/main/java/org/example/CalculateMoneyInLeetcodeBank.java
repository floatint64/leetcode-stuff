package org.example;

public class CalculateMoneyInLeetcodeBank {

    public int totalMoney(int n) {

        int total = 0;

        int currDay = 0;
        int prevMondayMoney = 0;

        while (currDay < n) {
            int currentWeekSum = 0;
            int prevDayMoney = prevMondayMoney + 1;
            int currWeekDays = Math.min(7, n - currDay);
            for (int i = 0; i < currWeekDays; i++) {
                currentWeekSum += prevDayMoney;
                prevDayMoney += 1;
            }
            currDay += currWeekDays;
            total += currentWeekSum;
            prevMondayMoney += 1;
        }

        return total;
    }
}
