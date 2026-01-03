package com.encapsulation.librarysystem;

import java.util.*;

public class LibraryTest {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Java Programming", "Herbert Schildt"));
        items.add(new Magazine(102, "Tech Today", "Editorial Team"));
        items.add(new DVD(103, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            r.reserveItem("Amit");

            System.out.println("-------------------------");
        }
    }
}

