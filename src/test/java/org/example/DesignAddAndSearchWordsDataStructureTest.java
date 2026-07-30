package org.example;

import org.example.common.CallSequenceTester;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DesignAddAndSearchWordsDataStructureTest {

    @Test
    void test1() throws Exception {
        DesignAddAndSearchWordsDataStructure d = new DesignAddAndSearchWordsDataStructure();

        List<String> methods = List.of(
                "addWord","addWord","addWord","search","search","search","search"
        );

        List<List<Object>> args = List.of(
                List.of("bad"),
                List.of("dad"),
                List.of("mad"),
                List.of("pad"),
                List.of("bad"),
                List.of(".ad"),
                List.of("b..")
        );

        List<Object> expected = Arrays.asList(
                null,null,null,false,true,true,true
        );

        CallSequenceTester.assertCallSequence(
                d,
                methods,
                args,
                expected
        );
    }

    @Test
    void test2() throws Exception {
        DesignAddAndSearchWordsDataStructure d = new DesignAddAndSearchWordsDataStructure();

        List<String> methods = List.of(
                "addWord","search","search","search"
        );

        List<List<Object>> args = List.of(
                List.of("b"),
                List.of("b"),
                List.of("."),
                List.of("c")
        );

        List<Object> expected = Arrays.asList(
                null, true, true, false
        );

        CallSequenceTester.assertCallSequence(
                d,
                methods,
                args,
                expected
        );
    }

    @Test
    void test3() throws Exception {
        DesignAddAndSearchWordsDataStructure d = new DesignAddAndSearchWordsDataStructure();

        List<String> methods = List.of(
                "search", "search"
        );

        List<List<Object>> args = List.of(
                List.of("b"),
                List.of(".")
        );

        List<Object> expected = Arrays.asList(
                false,false
        );

        CallSequenceTester.assertCallSequence(
                d,
                methods,
                args,
                expected
        );
    }

    @Test
    void test4() throws Exception {
        DesignAddAndSearchWordsDataStructure d = new DesignAddAndSearchWordsDataStructure();

        List<String> methods = List.of(
                "addWord","addWord","addWord","addWord","search","search","addWord","search","search","search","search","search","search"
        );

        List<List<Object>> args = List.of(
                List.of("at"),
                List.of("and"),
                List.of("an"),
                List.of("add"),
                //
                List.of("a"),
                List.of(".at"),
                List.of("bat"),
                //
                List.of(".at"),
                List.of("an."),
                List.of("a.d."),
                List.of("b."),
                List.of("a.d"),
                List.of(".")
        );

        List<Object> expected = Arrays.asList(
                null,null,null,null,false,false,null,true,
                true,false,false,true,false
        );

        CallSequenceTester.assertCallSequence(
                d,
                methods,
                args,
                expected
        );
    }

}