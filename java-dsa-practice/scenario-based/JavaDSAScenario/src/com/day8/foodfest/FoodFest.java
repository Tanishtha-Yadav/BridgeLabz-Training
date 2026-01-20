package com.day8.foodfest;

import java.util.Arrays;

class FoodFest {

    // Merge two sorted subarrays
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {   // <= keeps stability
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        // Zone-wise daily footfall data (already sorted)
        int[] zoneA = {120, 200, 350};
        int[] zoneB = {150, 220, 400};
        int[] zoneC = {100, 180, 300};

        // Combine all zones into one array
        int[] master = new int[zoneA.length + zoneB.length + zoneC.length];
        int index = 0;

        for (int x : zoneA) master[index++] = x;
        for (int x : zoneB) master[index++] = x;
        for (int x : zoneC) master[index++] = x;

        // Apply Merge Sort
        mergeSort(master, 0, master.length - 1);

        System.out.println("Sorted Stall Footfall Data:");
        System.out.println(Arrays.toString(master));
    }
}
