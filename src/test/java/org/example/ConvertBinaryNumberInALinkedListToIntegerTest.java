package org.example;

import org.example.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBinaryNumberInALinkedListToIntegerTest {

    @Test
    void getDecimalValue() {

        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger();

        var head = new ListNode(1, new ListNode(0, new ListNode(1)));

        Assertions.assertEquals(5, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));
    }

    @Test
    void getDecimalValue2() {

        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger();

        var head = ListNode.fromIntStream(IntStream.of(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));

        Assertions.assertEquals(2147483647, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));
    }

    @Test
    void getDecimalValue3() {

        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger();

        var head = ListNode.fromIntStream(IntStream.of(1,0,0,1,0,0,1,1,1,0,0,0,0,0,0));

        Assertions.assertEquals(18880, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));
    }
}