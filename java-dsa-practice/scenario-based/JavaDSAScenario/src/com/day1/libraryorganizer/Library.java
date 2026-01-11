package com.day1.libraryorganizer;

import java.util.*;

public class Library {

    private Map<String, LinkedList<Book>> catalog = new HashMap<>();
    private Set<Book> bookSet = new HashSet<>(); // optional

    public void addBook(String genre, Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not allowed");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        bookSet.add(book);
    }

    public void removeBook(String genre, Book book) {
        if (catalog.containsKey(genre)) {
            catalog.get(genre).remove(book);
            bookSet.remove(book);
        }
    }

    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " : " + catalog.get(genre));
        }
    }
}
