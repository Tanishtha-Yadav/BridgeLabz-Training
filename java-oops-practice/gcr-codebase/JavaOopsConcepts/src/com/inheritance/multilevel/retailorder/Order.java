package com.inheritance.multilevel.retailorder;

public class Order {

	int orderID;
	String orderDate;
	
	Order(int orderID, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}
