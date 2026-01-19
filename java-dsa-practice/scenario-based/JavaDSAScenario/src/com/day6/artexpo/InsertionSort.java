package com.day6.artexpo;

class InsertionSort {

    public static void sort(Artist[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Artist key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].regTime > key.regTime) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

