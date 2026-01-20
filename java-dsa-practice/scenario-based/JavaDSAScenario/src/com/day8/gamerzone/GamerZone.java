package com.day8.gamerzone;

import java.util.Arrays;

class GamerZone {

    // Quick Sort
    static void quickSort(int[] scores, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(scores, low, high);

            quickSort(scores, low, pivotIndex - 1);
            quickSort(scores, pivotIndex + 1, high);
        }
    }

    // Partition logic
    static int partition(int[] scores, int low, int high) {
        int pivot = scores[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (scores[j] > pivot) { // descending order (high score first)
                i++;
                swap(scores, i, j);
            }
        }
        swap(scores, i + 1, high);
        return i + 1;
    }

    static void swap(int[] scores, int i, int j) {
        int temp = scores[i];
        scores[i] = scores[j];
        scores[j] = temp;
    }

    public static void main(String[] args) {

        // Dynamic, unsorted high scores
        int[] playerScores = {4500, 1200, 9800, 6700, 5400, 8000};

        // Rank players using Quick Sort
        quickSort(playerScores, 0, playerScores.length - 1);

        System.out.println("Leaderboard (High to Low):");
        System.out.println(Arrays.toString(playerScores));
    }
}
