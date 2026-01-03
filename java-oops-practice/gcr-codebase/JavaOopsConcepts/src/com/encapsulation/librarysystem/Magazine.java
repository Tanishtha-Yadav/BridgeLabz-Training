package com.encapsulation.librarysystem;

class Magazine extends LibraryItem implements Reservable {

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7;  
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            reserve(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

