package org.example;

import org.example.common.CallSequenceTester;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImplementTrieTest {

    @Test
    void implementTrie() throws Exception {
        ImplementTrie trie = new ImplementTrie();

        List<String> methods = List.of(
                "insert", "search", "search", "startsWith", "insert", "search"
        );

        List<List<Object>> args = List.of(
                List.of("apple"),
                List.of("apple"),
                List.of("app"),
                List.of("app"),
                List.of("app"),
                List.of("app")
        );

        List<Object> expected = Arrays.asList(
                null, true, false, true, null, true
        );

        CallSequenceTester.assertCallSequence(
                trie,
                methods,
                args,
                expected
        );
    }

    @Test
    void implementTrie2() throws Exception {
        ImplementTrie trie = new ImplementTrie();

        List<String> methods = List.of(
                "insert", "search", "startsWith"
        );

        List<List<Object>> args = List.of(
                List.of("apple"),
                List.of("apple"),
                List.of("apple")
        );

        List<Object> expected = Arrays.asList(
                null, true, true
        );

        CallSequenceTester.assertCallSequence(
                trie,
                methods,
                args,
                expected
        );
    }

    @Test
    void implementTrie3() throws Exception {
        ImplementTrie trie = new ImplementTrie();

        List<String> methods = List.of(
                "insert", "search", "startsWith"
        );

        List<List<Object>> args = List.of(
                List.of("a"),
                List.of("a"),
                List.of("a")
        );

        List<Object> expected = Arrays.asList(
                null, true, true
        );

        CallSequenceTester.assertCallSequence(
                trie,
                methods,
                args,
                expected
        );
    }

    @Test
    void implementTrie4() throws Exception {
        ImplementTrie trie = new ImplementTrie();

        List<String> methods = List.of(
                "insert", "search", "startsWith"
        );

        List<List<Object>> args = List.of(
                List.of("a"),
                List.of("b"),
                List.of("z")
        );

        List<Object> expected = Arrays.asList(
                null, false, false
        );

        CallSequenceTester.assertCallSequence(
                trie,
                methods,
                args,
                expected
        );
    }

    @Test
    void implementTrie5() throws Exception {
        ImplementTrie trie = new ImplementTrie();

        List<String> methods = List.of(
                "insert","search","search","search","startsWith","startsWith","startsWith"
        );

        List<List<Object>> args = List.of(
                List.of("hello"),
                List.of("hell"),
                List.of("helloa"),
                List.of("hello"),
                List.of("hell"),
                List.of("helloa"),
                List.of("hello")
        );

        List<Object> expected = Arrays.asList(
                null,false,false,true,true,false,true
        );

        CallSequenceTester.assertCallSequence(
                trie,
                methods,
                args,
                expected
        );
    }

}