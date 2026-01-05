package com.day3.swiftcart;

import java.util.ArrayList;

public class SwiftCartTest {

    public static void main(String[] args)
    {

        Product milk = new PerishableProduct("Milk", 60);
        Product vegetables = new PerishableProduct("Vegetables", 120);
        Product rice = new NonPerishableProduct("Rice", 500);

        ArrayList<Product> items = new ArrayList<>();
        items.add(milk);
        items.add(vegetables);
        items.add(rice);

        Cart cart = new Cart(items);

        cart.applyDiscount(50); 
        cart.generateBill();
    }
}
