package org.example;

public class PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int partSum = totalSum / 3;

        if (totalSum % 3 != 0) {
            return false;
        }

        int tmpParSum = arr[0];
        int partsCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (tmpParSum == partSum) {
                partsCount++;
                tmpParSum = 0;
            }
            tmpParSum += arr[i];
        }

        if (tmpParSum == partSum) {
            partsCount++;
        }

        return partsCount >= 3;
    }
}
