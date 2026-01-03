package com.encapsulation.librarysystem;

class Book extends LibraryItem implements Reservable {

    Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 21;  
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            reserve(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
