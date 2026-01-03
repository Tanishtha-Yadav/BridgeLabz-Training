package com.encapsulation.fooddelivery;

import java.util.*;

public class FoodOrderTest {

    public static void processOrder(List<FoodItem> items) {

        for (FoodItem item : items) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            Discountable d = (Discountable) item;
            System.out.println(d.getDiscountDetails());
            System.out.println("Discount: " + d.applyDiscount());

            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 350, 1));

        processOrder(order);
    }
}
