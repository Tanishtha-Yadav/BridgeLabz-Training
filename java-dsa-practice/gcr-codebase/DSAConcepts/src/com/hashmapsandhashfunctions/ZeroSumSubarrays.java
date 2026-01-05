package com.hashmapsandhashfunctions;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {
        // Map to store cumulative sum → list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Initialize with sum 0 at index -1 to handle subarrays starting at index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum has been seen before
            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int start : indices) {
                    System.out.println("Subarray [" + (start + 1) + ", " + i + "]");
                }
            }

            // Add current index to map
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4, -2, -2};

        System.out.println("Zero-sum subarrays:");
        findZeroSumSubarrays(arr);
    }
}
 