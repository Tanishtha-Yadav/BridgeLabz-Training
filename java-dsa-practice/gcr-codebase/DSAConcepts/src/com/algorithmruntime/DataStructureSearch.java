package com.algorithmruntime;

import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int n = 1000000; // dataset size
        int[] arrayData = new int[n];
        HashSet<Integer> hashSetData = new HashSet<>();
        TreeSet<Integer> treeSetData = new TreeSet<>();

        // Fill datasets
        for (int i = 0; i < n; i++) {
            arrayData[i] = i;
            hashSetData.add(i);
            treeSetData.add(i);
        }

        int target = n - 1;

        // -------- Array Search (Linear) --------
        long start = System.nanoTime();
        boolean found = false;
        for (int i : arrayData) {
            if (i == target) {
                found = true;
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) / 1_000_000.0 + " ms");

        // -------- HashSet Search (O(1)) --------
        start = System.nanoTime();
        found = hashSetData.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) / 1_000_000.0 + " ms");

        // -------- TreeSet Search (O(log N)) --------
        start = System.nanoTime();
        found = treeSetData.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
