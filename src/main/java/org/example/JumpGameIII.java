package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }

        Queue<Integer> queue = new ArrayDeque<>(arr.length);

        boolean[] visited = new boolean[arr.length];

        queue.add(start);

        while (!queue.isEmpty()) {
            int idx = queue.poll();

            if (!visited[idx]) {
                visited[idx] = true;
                if (arr[idx] == 0) {
                    return true;
                }

                int nextLeft = idx - arr[idx];
                if (nextLeft >= 0) {
                    queue.add(nextLeft);
                }
                int nextRight = idx + arr[idx];
                if (nextRight < arr.length) {
                    queue.add(nextRight);
                }

            }
        }

        return false;
    }
}
