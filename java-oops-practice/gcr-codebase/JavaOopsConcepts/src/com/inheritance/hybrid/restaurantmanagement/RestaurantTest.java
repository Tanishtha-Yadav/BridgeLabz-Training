package com.inheritance.hybrid.restaurantmanagement;

public class RestaurantTest {
    public static void main(String[] args) {

        Worker w1 = new Chef("Rahul", 101);
        Worker w2 = new Waiter("Amit", 102);

        System.out.println("Chef Duties : ");
        w1.performDuties();
        System.out.println("Waiter Duties : ");
        w2.performDuties();
    }
}
