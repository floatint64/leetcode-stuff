package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindTheSequenceOfStringsAppearedOnTheScreen {

    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();

        char[] tmp = new char[target.length()];

        tmp[0] = 'a';

        int lastPos = 0;

        int i = 0;

        while (i < target.length()) {
            result.add(String.valueOf(tmp, 0, lastPos + 1));
            if (tmp[lastPos] < target.charAt(i)) {
                tmp[lastPos]++;
            } else {
                i++;
                var nextPos = lastPos + 1;
                if (nextPos < target.length()) {
                    tmp[nextPos] = 'a';
                    lastPos = nextPos;
                }
            }
        }

        return result;
    }
}
