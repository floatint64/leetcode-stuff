package org.example;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {

        Arrays.sort(arr);

        int skipCount = (int)(arr.length * 0.05);

        int sum = 0;
        for (int i = skipCount; i < arr.length - skipCount; i++) {
            sum += arr[i];
        }

        return (double) sum / (arr.length - skipCount * 2);
    }
}
