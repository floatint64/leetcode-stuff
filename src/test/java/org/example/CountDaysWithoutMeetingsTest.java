package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDaysWithoutMeetingsTest {

    @Test
    void countDays() {
        CountDaysWithoutMeetings countDaysWithoutMeetings = new CountDaysWithoutMeetings();

        int[][] meetings = {
                {5,7},{1,3},{9,10}
        };

        int days = 10;

        Assertions.assertEquals(2, countDaysWithoutMeetings.countDays(days, meetings));
    }

    @Test
    void countDays2() {
        CountDaysWithoutMeetings countDaysWithoutMeetings = new CountDaysWithoutMeetings();

        int[][] meetings = {
                {2,4},{1,3}
        };

        int days = 5;

        Assertions.assertEquals(1, countDaysWithoutMeetings.countDays(days, meetings));
    }

    @Test
    void countDays3() {
        CountDaysWithoutMeetings countDaysWithoutMeetings = new CountDaysWithoutMeetings();

        int[][] meetings = {
                {1,6}
        };

        int days = 6;

        Assertions.assertEquals(0, countDaysWithoutMeetings.countDays(days, meetings));
    }

    @Test
    void countDays4() {
        CountDaysWithoutMeetings countDaysWithoutMeetings = new CountDaysWithoutMeetings();

        int[][] meetings = {
                {1,1}
        };

        int days = 5;

        Assertions.assertEquals(4, countDaysWithoutMeetings.countDays(days, meetings));
    }

    @Test
    void countDays5() {
        CountDaysWithoutMeetings countDaysWithoutMeetings = new CountDaysWithoutMeetings();

        int[][] meetings = {
                {1,3}, {4, 5}
        };

        int days = 5;

        Assertions.assertEquals(0, countDaysWithoutMeetings.countDays(days, meetings));
    }

    @Test
    void countDays6() {
        CountDaysWithoutMeetings countDaysWithoutMeetings = new CountDaysWithoutMeetings();

        int[][] meetings = {
                {10,10}
        };

        int days = 10;

        Assertions.assertEquals(9, countDaysWithoutMeetings.countDays(days, meetings));
    }

    @Test
    void countDays7() {
        CountDaysWithoutMeetings countDaysWithoutMeetings = new CountDaysWithoutMeetings();

        int[][] meetings = {
                {2,3},{3,5},{8,8}
        };

        int days = 8;

        Assertions.assertEquals(3, countDaysWithoutMeetings.countDays(days, meetings));
    }
}