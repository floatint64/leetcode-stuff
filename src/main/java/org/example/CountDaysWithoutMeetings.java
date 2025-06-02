package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class CountDaysWithoutMeetings {
    public int countDays(int days, int[][] meetings) {
        int result = 0;
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        int lastMergedIdx = 0;

        for (int i = 1; i < meetings.length; i++) {
            var lastMerged = meetings[lastMergedIdx];
            var currentMeeting = meetings[i];

            if (currentMeeting[0] <= lastMerged[1]) {
                lastMerged[1] = Math.max(lastMerged[1], currentMeeting[1]);
                currentMeeting[0] = 0;
                currentMeeting[1] = -1;
            } else {
                lastMergedIdx = i;
            }
        }

        int i = 0;

        result = days;

        while (i < lastMergedIdx + 1) {
            var curr = meetings[i++];
            result -= (curr[1] - curr[0] + 1);
        }

        return result;
    }
}
