package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void canConstruct() {
        RansomNote ransomNote = new RansomNote();

        String ransom = "a";
        String magazine = "b";
        boolean expected = false;

        Assertions.assertEquals(expected, ransomNote.canConstruct(ransom, magazine));
    }

    @Test
    void canConstruct2() {
        RansomNote ransomNote = new RansomNote();

        String ransom = "aa";
        String magazine = "ab";
        boolean expected = false;

        Assertions.assertEquals(expected, ransomNote.canConstruct(ransom, magazine));
    }

    @Test
    void canConstruct3() {
        RansomNote ransomNote = new RansomNote();

        String ransom = "aa";
        String magazine = "aab";
        boolean expected = true;

        Assertions.assertEquals(expected, ransomNote.canConstruct(ransom, magazine));
    }
}