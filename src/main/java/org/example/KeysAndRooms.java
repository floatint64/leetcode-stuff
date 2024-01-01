package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    private void visitRoom(List<List<Integer>> rooms, List<Integer> room, Set<Integer> visitedRooms) {
        for (var key : room) {
            if (!visitedRooms.contains(key)) {
                visitedRooms.add(key);
                visitRoom(rooms, rooms.get(key), visitedRooms);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visitedRooms = new HashSet<>();

        visitedRooms.add(0);
        visitRoom(rooms, rooms.get(0), visitedRooms);


        return visitedRooms.size() == rooms.size();
    }
}
