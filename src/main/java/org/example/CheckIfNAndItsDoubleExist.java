package org.example;

import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        var hash = new HashSet<Integer>();

        for (var i : arr) {
            if (hash.contains(i * 2)) {
                return true;
            } else if (i % 2 == 0 && hash.contains(i / 2)) {
                return true;
            } else {
                hash.add(i);
            }
        }

        return false;
    }
}
