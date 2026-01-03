package com.encapsulation.ecommerceplatform;

class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 10 / 100; 
    }

    @Override
    public double calculateTax() {
        return price * 18 / 100;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST";
    }
}
