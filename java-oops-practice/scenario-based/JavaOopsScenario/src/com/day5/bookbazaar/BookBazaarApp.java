package com.day5.bookbazaar;

public class BookBazaarApp {
    public static void main(String[] args) {

        Book book1 = new PrintedBook("Clean Code", "Robert Martin", 600, 5);
        Book book2 = new EBook("Effective Java", "Joshua Bloch", 500);

        Order order1 = new Order("Tanishtha", book1, 3);
        order1.confirmOrder();
        order1.showOrder();

        System.out.println();

        Order order2 = new Order("Aman", book2, 2);
        order2.confirmOrder();
        order2.showOrder();
    }
}
