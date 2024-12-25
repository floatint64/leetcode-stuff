package org.example;

public class TrappingRainWater {
    public int trap(int[] height) {

        int n = height.length;

        int[] lv = new int[n];
        int[] rv = new int[n];

        lv[0] = height[0];
        rv[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            lv[i] = Math.max(lv[i - 1], height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rv[i] = Math.max(rv[i + 1], height[i]);
        }

        int water = 0;
        for (int i = 1; i < n - 1; i++) {
            int min = Math.min(lv[i - 1], rv[i + 1]);
            if (min > height[i]) {
                water += min - height[i];
            }
        }

        return water;
    }
}
