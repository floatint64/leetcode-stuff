package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementMagicDictionaryTest {

    @Test
    void buildDict() {
        ImplementMagicDictionary implementMagicDictionary = new ImplementMagicDictionary();
        implementMagicDictionary.buildDict(new String[] {"hello", "leetcode"});
        Assertions.assertFalse(implementMagicDictionary.search("hello"));
        Assertions.assertTrue(implementMagicDictionary.search("hhllo"));
        Assertions.assertFalse(implementMagicDictionary.search("hell"));
        Assertions.assertFalse(implementMagicDictionary.search("leetcoded"));
    }

    @Test
    void buildDict2() {
        ImplementMagicDictionary implementMagicDictionary = new ImplementMagicDictionary();
        implementMagicDictionary.buildDict(new String[] {"hello","hallo","leetcode"});
        Assertions.assertTrue(implementMagicDictionary.search("hello"));
        Assertions.assertTrue(implementMagicDictionary.search("hhllo"));
        Assertions.assertFalse(implementMagicDictionary.search("hell"));
        Assertions.assertFalse(implementMagicDictionary.search("leetcoded"));
    }
}