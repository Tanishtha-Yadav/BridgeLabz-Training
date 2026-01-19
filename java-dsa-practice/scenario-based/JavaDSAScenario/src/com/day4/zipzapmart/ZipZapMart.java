package com.day4.zipzapmart;

public class ZipZapMart {
    public static void main(String[] args) {

        Transaction[] sales = {
            new Transaction("2026-01-15", 450.0),
            new Transaction("2026-01-14", 300.0),
            new Transaction("2026-01-15", 200.0),
            new Transaction("2026-01-13", 900.0)
        };

        MergeSort.mergeSort(sales, 0, sales.length - 1);

        for (Transaction t : sales)
            System.out.println(t);
    }
}
