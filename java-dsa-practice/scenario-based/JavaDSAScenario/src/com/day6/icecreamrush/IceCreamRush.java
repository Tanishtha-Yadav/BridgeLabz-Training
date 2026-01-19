package com.day6.icecreamrush;

public class IceCreamRush {
    public static void main(String[] args) {

        Flavour[] flavors = {
            new Flavour("Vanilla", 120),
            new Flavour("Chocolate", 200),
            new Flavour("Strawberry", 90),
            new Flavour("Mango", 150),
            new Flavour("Butterscotch", 110)
        };

        BubbleSort.sort(flavors);

        for (Flavour f : flavors)
            System.out.println(f);
    }
}
