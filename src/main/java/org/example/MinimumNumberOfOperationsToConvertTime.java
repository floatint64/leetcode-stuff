package org.example;

public class MinimumNumberOfOperationsToConvertTime {

    public int convertTime(String current, String correct) {
        int currentMinutes = (current.charAt(0) - '0') * 10 * 60 + (current.charAt(1) - '0') * 60 +
                (current.charAt(3) - '0') * 10 + (current.charAt(4) - '0');
        int correctMinutes = (correct.charAt(0) - '0') * 10 * 60 + (correct.charAt(1) - '0') * 60 +
                (correct.charAt(3) - '0') * 10 + (correct.charAt(4) - '0');


        int[] ops = {60, 15, 5, 1};
        int opIdx = 0;

        int opCount = 0;

        while (currentMinutes != correctMinutes) {
            int nextVal = currentMinutes + ops[opIdx];
            if (nextVal > correctMinutes) {
                opIdx++;
            } else {
                opCount++;
                currentMinutes = nextVal;
            }
        }

        return opCount;
    }
}
