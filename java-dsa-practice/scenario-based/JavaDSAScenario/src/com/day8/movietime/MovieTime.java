package com.day8.movietime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MovieTime {

    // Insertion Sort using LocalTime
    static void insertionSort(List<LocalTime> shows) {
        for (int i = 1; i < shows.size(); i++) {
            LocalTime key = shows.get(i);
            int j = i - 1;

            while (j >= 0 && shows.get(j).isAfter(key)) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }

    static void display(List<LocalTime> shows) {
        for (LocalTime time : shows) {
            System.out.print(time + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        List<LocalTime> showTimes = new ArrayList<>();

        // Already almost sorted showtimes
        showTimes.add(LocalTime.of(9, 30));
        showTimes.add(LocalTime.of(11, 0));
        showTimes.add(LocalTime.of(14, 0));
        showTimes.add(LocalTime.of(18, 0));

        // New show added in real time
        showTimes.add(LocalTime.of(12, 30));

        // Sort using Insertion Sort
        insertionSort(showTimes);

        System.out.print("Sorted Show Times: ");
        display(showTimes);
    }
}
