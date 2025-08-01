package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    private  static final List<List<Integer>> dp = new ArrayList<>(30);

    static {
        dp.add(List.of(1));
        dp.add(List.of(1,1));
        for (int i = 2; i < 30; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(dp.get(i - 1).get(j - 1) + dp.get(i - 1).get(j));
            }
            row.add(1);

            dp.add(row);
        }
    }

    public List<List<Integer>> generate(int numRows) {
        return dp.stream()
                .limit(numRows)
                .toList();
    }
}
