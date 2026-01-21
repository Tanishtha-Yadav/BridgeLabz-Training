package com.day9.medwarehouse;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter {

    // Merge Sort
    public static List<Medicine> mergeSort(List<Medicine> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        List<Medicine> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<Medicine> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    // Merge two sorted lists
    private static List<Medicine> merge(List<Medicine> left, List<Medicine> right) {
        List<Medicine> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getExpiry().compareTo(right.get(j).getExpiry()) <= 0) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) merged.add(left.get(i++));
        while (j < right.size()) merged.add(right.get(j++));

        return merged;
    }
}
