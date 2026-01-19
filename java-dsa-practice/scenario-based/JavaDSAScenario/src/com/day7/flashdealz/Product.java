package com.day7.flashdealz;

class Product {
    String name;
    int discount;   // discount percentage

    Product(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    public String toString() {
        return name + " -> " + discount + "%";
    }
}
