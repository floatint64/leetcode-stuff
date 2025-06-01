package org.example;

public class MergeTripletsToFormTargetTriplet {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        int i = 0;

        while (i < triplets.length && (triplets[i][0] > target[0] || triplets[i][1] > target[1] || triplets[i][2] > target[2])) {
            i++;
        }

        if (i >= triplets.length) {
            return false;
        }

        int[] lastTriplet = triplets[i];
        i++;

        while (i < triplets.length && (lastTriplet[0] != target[0] || lastTriplet[1] != target[1] || lastTriplet[2] != target[2])) {
            int[] tmpTriplet = triplets[i];
            if (tmpTriplet[0] > target[0] || tmpTriplet[1] > target[1] || tmpTriplet[2] > target[2]) {
                i++;
                continue;
            }
            lastTriplet[0] = Math.max(lastTriplet[0], tmpTriplet[0]);
            lastTriplet[1] = Math.max(lastTriplet[1], tmpTriplet[1]);
            lastTriplet[2] = Math.max(lastTriplet[2], tmpTriplet[2]);
            i++;
        }

        return lastTriplet[0] == target[0] && lastTriplet[1] == target[1] && lastTriplet[2] == target[2];
    }
}
