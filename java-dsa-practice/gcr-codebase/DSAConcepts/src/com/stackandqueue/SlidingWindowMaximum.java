package com.stackandqueue;

import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices
        int ri = 0;

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1)
                deque.pollFirst();

            // Remove smaller elements as they are useless
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();

            // Add current element's index
            deque.offerLast(i);

            // Record maximum for window
            if (i >= k - 1)
                result[ri++] = nums[deque.peekFirst()];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] max = maxSlidingWindow(nums, k);
        System.out.println("Sliding window maximums:");
        for (int m : max) {
            System.out.print(m + " ");
        }
    }
}
