package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeysAndRoomsTest {

    @Test
    void canVisitAllRooms() {

        KeysAndRooms keysAndRooms = new KeysAndRooms();

        // [[1],[2],[3],[]]

        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        );

        Assertions.assertTrue(keysAndRooms.canVisitAllRooms(rooms));
    }

    @Test
    void canVisitAllRooms2() {

        KeysAndRooms keysAndRooms = new KeysAndRooms();

        // [[1,3],[3,0,1],[2],[0]]

        List<List<Integer>> rooms = List.of(
                List.of(1,3),
                List.of(3,0,1),
                List.of(2),
                List.of(0)
        );

        Assertions.assertFalse(keysAndRooms.canVisitAllRooms(rooms));
    }

    @Test
    void canVisitAllRooms3() {

        KeysAndRooms keysAndRooms = new KeysAndRooms();

        List<List<Integer>> rooms = List.of(
                List.of(2),
                List.of(),
                List.of(1)
        );

        Assertions.assertTrue(keysAndRooms.canVisitAllRooms(rooms));
    }

    @Test
    void canVisitAllRooms4() {

        KeysAndRooms keysAndRooms = new KeysAndRooms();

        List<List<Integer>> rooms = List.of(
                List.of(10,35,25,33),
                List.of(),
                List.of(47,27),
                List.of(23,3,28,39),
                List.of(36,41,10,24),
                List.of(14,40,42,44),
                List.of(41,35),
                List.of(48),
                List.of(24,26,44,23,11,17),
                List.of(1,17,20,30),
                List.of(),
                List.of(38,39,44),
                List.of(),
                List.of(11,21,45,13),
                List.of(1,27,14,19),
                List.of(23),
                List.of(30,21,8,22,40),
                List.of(14,48),
                List.of(32,6),
                List.of(5,15,26,34,38),
                List.of(43,25),
                List.of(18,10,33),
                List.of(15,34,9),
                List.of(18,46,48,7,13),
                List.of(5,29,4),
                List.of(42,34),
                List.of(7,13,37,8,15,21),
                List.of(4,5),
                List.of(38,20,42),
                List.of(16,19,47),
                List.of(8,29),
                List.of(28,33,37,49),
                List.of(9,39,49,41),
                List.of(31,12,26,32),
                List.of(2,40,32,46),
                List.of(27,22),
                List.of(12,37,2),
                List.of(31,1),
                List.of(46,19,16,18,30),
                List.of(35),
                List.of(6,3,7,28,43),
                List.of(4,25,2,29),
                List.of(),
                List.of(22,24,45,12),
                List.of(36,31),
                List.of(3,36,45),
                List.of(20,43,49),
                List.of(11),
                List.of(16,6),
                List.of(17,47)
        );

        Assertions.assertTrue(keysAndRooms.canVisitAllRooms(rooms));
    }
}