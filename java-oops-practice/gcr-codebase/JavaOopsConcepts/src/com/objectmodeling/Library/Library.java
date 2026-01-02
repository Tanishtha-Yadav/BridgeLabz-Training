package com.objectmodeling.Library;
import java.util.ArrayList;
class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            System.out.println(" - " + b.getDetails());
        }
    }
}

