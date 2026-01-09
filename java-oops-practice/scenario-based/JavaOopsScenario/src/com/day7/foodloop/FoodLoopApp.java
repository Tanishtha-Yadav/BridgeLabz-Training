package com.day7.foodloop;

import java.util.ArrayList;
import java.util.List;

public class FoodLoopApp {

    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Roll", 150.0, true);
        FoodItem f2 = new NonVegItem("Chicken Burger", 250.0, true);

        List<FoodItem> combo = new ArrayList<>();
        combo.add(f1);
        combo.add(f2);

        Order order = new Order(combo);
        order.placeOrder();
    }
}
