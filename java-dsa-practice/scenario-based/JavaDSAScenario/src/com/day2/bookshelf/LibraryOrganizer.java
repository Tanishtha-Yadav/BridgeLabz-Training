package com.day2.bookshelf;

public class LibraryOrganizer {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", "1984", "George Orwell");
        shelf.addBook("Fiction", "Animal Farm", "George Orwell");
        shelf.addBook("Science", "A Brief History of Time", "Stephen Hawking");

        shelf.printCatalog();

        shelf.removeBook("Fiction", "1984");
        shelf.printCatalog();
    }
}
