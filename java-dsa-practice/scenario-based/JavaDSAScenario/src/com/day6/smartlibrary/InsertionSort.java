package com.day6.smartlibrary;

class InsertionSort {

    public static void sort(Book[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Book key = arr[i];
            int j = i - 1;

            // Alphabetical order by title
            while (j >= 0 && arr[j].title.compareTo(key.title) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
