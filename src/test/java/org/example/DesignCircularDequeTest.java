package org.example;

import org.example.common.CallSequenceTester;
import org.junit.jupiter.api.Test;

import java.util.List;

class DesignCircularDequeTest {


    @Test
    void designCircularDeque() throws Exception {
        DesignCircularDeque deque = new DesignCircularDeque(3);
//        Assertions.assertTrue(deque.insertLast(1));
//        Assertions.assertTrue(deque.insertLast(2));
//        Assertions.assertTrue(deque.insertFront(3));
//        Assertions.assertFalse(deque.insertFront(4));
//        Assertions.assertEquals(2, deque.getRear());
//        Assertions.assertTrue(deque.isFull());
//        Assertions.assertTrue(deque.deleteLast());
//        Assertions.assertTrue(deque.insertFront(4));
//        Assertions.assertEquals(4, deque.getFront());

        var calls = List.of(
                "insertLast",
                "insertLast",
                "insertFront",
                "insertFront",
                "getRear",
                "isFull",
                "deleteLast",
                "insertFront",
                "getFront"
        );


        List<List<Object>> params = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(4),
                List.of(),
                List.of(),
                List.of(),
                List.of(4),
                List.of()
        );

        List<Object> expected = List.of(
                true,
                true,
                true,
                false,
                2,
                true,
                true,
                true,
                4
        );


        CallSequenceTester.assertCallSequence(
                deque,
                calls,
                params,
                expected
        );
    }

    @Test
    //@MethodSource("designCircularDeque2")
    void designCircularDeque2() throws Exception {

        DesignCircularDeque deque = new DesignCircularDeque(3);
        var calls = List.of(
                "insertLast",
                "insertLast",
                "insertLast",
                "isFull",
                "getRear",
                "deleteLast",
                "deleteLast",
                "deleteLast",
                "isEmpty"
        );


        List<List<Object>> params = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(),
                List.of(),
                List.of(),
                List.of(),
                List.of(),
                List.of()
        );

        List<Object> expected = List.of(
                true,
                true,
                true,
                true,
                3,
                true,
                true,
                true,
                true
        );

        CallSequenceTester.assertCallSequence(
                deque,
                calls,
                params,
                expected
        );
    }

    @Test
    void designCircularDeque3() throws Exception {
        DesignCircularDeque deque = new DesignCircularDeque(5);
        var calls = List.of(
                "insertFront","insertLast","getFront","insertLast","getFront","insertFront","getRear","getFront","getFront","deleteLast","getRear"
        );


        List<List<Object>> params = List.of(
                List.of(7),List.of(0),List.of(),List.of(3),List.of(),List.of(9),List.of(),List.of(),List.of(),List.of(),List.of()
        );

        List<Object> expected = List.of(
                true,true,7,true,7,true,3,9,9,true,0
        );

        CallSequenceTester.assertCallSequence(
                deque,
                calls,
                params,
                expected
        );
    }


    @Test
    void designCircularDeque4() throws Exception {
        DesignCircularDeque deque = new DesignCircularDeque(3);
        var calls = List.of(
                "insertFront","insertLast","insertLast","getFront","deleteLast","getRear","insertFront","deleteFront","getRear","insertLast","isFull"
        );


        List<List<Object>> params = List.of(
                List.of(8),List.of(8),List.of(2),List.of(),List.of(),List.of(),List.of(9),List.of(),List.of(),List.of(2),List.of()
        );

        List<Object> expected = List.of(
                true,true,true,8,true,8,true,true,8,true,false
        );

        CallSequenceTester.assertCallSequence(
                deque,
                calls,
                params,
                expected
        );
    }

}