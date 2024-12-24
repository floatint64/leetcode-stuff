package org.example;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 0) {
            return 0;
        }

        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;

        while (l != r) {
            int diff = r - l;
            int min = Math.min(height[l], height[r]);
            int currArea = diff * min;
            maxArea = Math.max(currArea, maxArea);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
