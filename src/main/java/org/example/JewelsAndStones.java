package org.example;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewelMap = new boolean['z' + 1];

        for (int i = 0; i < jewels.length(); i++){
            jewelMap[jewels.charAt(i)] = true;
        }

        int cnt = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewelMap[stones.charAt(i)]) {
                cnt++;
            }
        }

        return cnt;
    }
}
