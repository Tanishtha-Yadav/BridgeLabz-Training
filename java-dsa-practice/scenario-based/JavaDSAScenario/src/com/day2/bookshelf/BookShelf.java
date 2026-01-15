package com.day2.bookshelf;

import java.util.*;

class BookShelf {

    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    HashSet<String> bookSet = new HashSet<>(); // optional duplication control

    // Add book
    void addBook(String genre, String title, String author) {

        String key = title + author;
        if (bookSet.contains(key)) {
            System.out.println("Duplicate book not allowed");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(new Book(title, author));
        bookSet.add(key);

        System.out.println("Book added to " + genre);
    }

    // Remove book (borrow)
    void removeBook(String genre, String title) {

        LinkedList<Book> books = catalog.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("No books available in " + genre);
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                bookSet.remove(b.title + b.author);
                System.out.println("Book borrowed: " + b);
                return;
            }
        }

        System.out.println("Book not found");
    }

    // Print catalog
    void printCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " → " + catalog.get(genre));
        }
    }
}
