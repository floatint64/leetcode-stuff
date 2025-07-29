package org.example;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {

    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>(1024);

        char start = s.charAt(0);
        char end = s.charAt(3);
        int startIdx = s.charAt(1) - '0';
        int endIdx = s.charAt(4) - '0';

        for (char c = start; c <= end; c++) {
            for (int ci = startIdx; ci <= endIdx; ci++) {
                char[] r = {0,0};
                r[0] = c;
                r[1] = (char)(ci + '0');
                result.add(String.valueOf(r));
            }
        }


        return result;
    }
}
