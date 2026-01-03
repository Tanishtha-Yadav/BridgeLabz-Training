package com.encapsulation.ecommerceplatform;

class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 20 / 100;  
    }

    @Override
    public double calculateTax() {
        return price * 12 / 100; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12% GST";
    }
}
