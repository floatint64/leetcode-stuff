package org.example;

import org.example.common.NestedInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniParserTest {

    @Test
    void deserialize() {
        MiniParser miniParser = new MiniParser();

        String s = "324";

        NestedInteger ni = miniParser.deserialize(s);

        int y = 0;
    }

    @Test
    void deserialize2() {
        MiniParser miniParser = new MiniParser();

        String s = "[324, 100]";

        NestedInteger ni = miniParser.deserialize(s);

        Assertions.assertEquals(s, ni.toString());
    }

    @Test
    void deserialize3() {
        MiniParser miniParser = new MiniParser();

        String s = "[324, 100, [101, 102], [103, [104]]]";

        NestedInteger ni = miniParser.deserialize(s);

        Assertions.assertEquals(s, ni.toString());
    }

    @Test
    void deserialize4() {
        MiniParser miniParser = new MiniParser();

        String s = "[]";

        NestedInteger ni = miniParser.deserialize(s);

        Assertions.assertEquals(s, ni.toString());
    }

    @Test
    void deserialize5() {
        MiniParser miniParser = new MiniParser();

        String s = "[[], [[]]]";

        NestedInteger ni = miniParser.deserialize(s);

        Assertions.assertEquals(s, ni.toString());
    }
}