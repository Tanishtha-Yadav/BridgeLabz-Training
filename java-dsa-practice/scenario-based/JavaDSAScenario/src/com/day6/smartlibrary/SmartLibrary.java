package com.day6.smartlibrary;

public class SmartLibrary {
    public static void main(String[] args) {

        Book[] books = {
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Computer Networks"),
            new Book("Operating Systems")
        };

        InsertionSort.sort(books);

        for (Book b : books)
            System.out.println(b);
    }
}

