package org.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    private static final String[][] HOURS = {
            {"0"},           // k = 0
            {"1", "2", "4", "8"},           // k = 1
            {"3", "5", "6", "9", "10"},      // k = 2
            {"7", "11"}                      // k = 3
    };

    private static final String[][] MINUTES = {
            {"00"},                                                         // k = 0
            {"01", "02", "04", "08", "16", "32"},                              // k = 1
            {"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"}, // k = 2
            {"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"}, // k = 3
            {"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"},  // k = 4
            {"31", "47", "55", "59"}                                       // k = 5
    };


    public List<String> readBinaryWatch(int turnedOn) {

        List<String> results = new ArrayList<>(1024);

        for (int h = 0; h < HOURS.length; h++) {
            int m = turnedOn - h;
            if (m < 0 || m >= MINUTES.length) continue;

            for (var hvalue : HOURS[h]) {
                for (var mvalue : MINUTES[m]) {
                    results.add(hvalue + ":" + mvalue);
                }
            }
        }

        return results;
    }
}
