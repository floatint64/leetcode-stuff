package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> listMap = new HashMap<>();

        int minSum = Integer.MAX_VALUE;
        var result = new ArrayList<String>(Math.max(list1.length, list2.length));

        for (int i = 0; i < list1.length; i++) {
            listMap.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            var list1Idx = listMap.get(list2[i]);
            if (list1Idx != null) {
                int idxSum = list1Idx + i;
                if (idxSum < minSum) {
                    minSum = idxSum;
                    result.clear();
                    result.add(list2[i]);
                } else if (idxSum == minSum) {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[]{});
    }
}
