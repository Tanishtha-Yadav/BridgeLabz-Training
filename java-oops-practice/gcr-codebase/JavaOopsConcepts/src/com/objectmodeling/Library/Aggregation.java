package com.objectmodeling.Library;

public class Aggregation {
    public static void main(String[] args) {

        // Independent Book objects
        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        // Two libraries
        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("College Library");

        // Aggregation: same books added to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1);   // same book, different library

        lib1.showBooks();
        lib2.showBooks();
    }
}
