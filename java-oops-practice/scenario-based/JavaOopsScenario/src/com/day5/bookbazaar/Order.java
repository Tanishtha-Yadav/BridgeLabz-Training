package com.day5.bookbazaar;

class Order {

    private String userName;
    private Book book;
    private int quantity;

    private String status = "CREATED";   // restricted updates

    Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        double discount = book.applyDiscount(quantity);
        return (book.price * quantity) - discount;
    }

    // Controlled status update
    void confirmOrder() {
        if (book.reduceStock(quantity)) {
            status = "CONFIRMED";
        } else {
            status = "FAILED";
        }
    }

    public void showOrder() {
        System.out.println("User: " + userName);
        System.out.println("Book: " + book.title);
        System.out.println("Quantity: " + quantity);
        System.out.println("Status: " + status);
        System.out.println("Total Cost: ₹" + calculateTotal());
    }
}
