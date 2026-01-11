package com.day1.libraryorganizer;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Dune", "Frank Herbert");
        Book b3 = new Book("1984", "George Orwell"); // duplicate

        library.addBook("Fiction", b1);
        library.addBook("Sci-Fi", b2);
        library.addBook("Fiction", b3);

        library.displayCatalog();

        library.removeBook("Fiction", b1);
        library.displayCatalog();
    }
}
