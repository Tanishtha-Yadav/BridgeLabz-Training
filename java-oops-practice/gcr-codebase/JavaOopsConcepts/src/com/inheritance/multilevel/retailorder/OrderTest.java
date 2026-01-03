package com.inheritance.multilevel.retailorder;

public class OrderTest {
    public static void main(String[] args) {

        Order o1 = new Order(101, "01-01-2026");
        Order o2 = new ShippedOrder(102, "02-01-2026", "abc");
        Order o3 = new DeliveredOrder(103, "03-01-2026", "xyz", "05-01-2026");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}


