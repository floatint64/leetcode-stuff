package org.example;

import java.util.PriorityQueue;

public class FinalArrayStateAfterKMultiplicationOperationsI {

    static class NumWithPos implements Comparable<NumWithPos>{
        int value;
        int pos;

        public NumWithPos(int value, int pos) {
            this.value = value;
            this.pos = pos;
        }

        @Override
        public int compareTo(NumWithPos o) {
            int v = value - o.value;
            return v == 0 ? pos - o.pos : v;
        }
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] result = new int[nums.length];

        PriorityQueue<NumWithPos> queue = new PriorityQueue<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            queue.add(new NumWithPos(nums[i], i));
        }

        for (int i = 0; i < k; i++) {
            var min = queue.poll();
            min.value *= multiplier;
            queue.add(min);
        }

        var head = queue.poll();

        while (head != null) {
            result[head.pos] = head.value;
            head = queue.poll();
        }

        return result;
    }
}
