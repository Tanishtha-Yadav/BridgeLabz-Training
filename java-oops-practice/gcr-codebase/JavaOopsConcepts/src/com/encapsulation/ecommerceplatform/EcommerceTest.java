package com.encapsulation.ecommerceplatform;

import java.util.*;

public class EcommerceTest {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        for (Product p : products) {
            p.displayDetails();
            System.out.println("Discount: " + p.calculateDiscount());

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                System.out.println(t.getTaxDetails());
                System.out.println("Tax: " + t.calculateTax());
            } else {
                System.out.println("No tax applicable");
            }

            System.out.println("-------------------------");
        }
    }
}
