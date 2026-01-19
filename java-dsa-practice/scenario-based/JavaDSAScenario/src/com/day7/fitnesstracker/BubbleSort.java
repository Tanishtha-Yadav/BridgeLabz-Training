package com.day7.fitnesstracker;

class BubbleSort {

    public static void sort(User[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Higher steps first
                if (arr[j].steps < arr[j + 1].steps) {
                    User temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

