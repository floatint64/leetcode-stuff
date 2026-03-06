package org.example;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public boolean checkOnesSegment(String s) {

        int maxSeq = 0;
        int currSeq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currSeq++;
                if (maxSeq > 0 && currSeq == 1) {
                    return false;
                }
                maxSeq = Math.max(maxSeq, currSeq);
            } else {
                currSeq = 0;
            }
        }

        return maxSeq > 0;
    }
}
