package com.day7.artify;

public class ArtifyApp {
    public static void main(String[] args) {

        User user = new User("Amit", 5000);

        Artwork art1 = new DigitalArt("Cyber City", "Ravi", 1500, "Digital License");
        Artwork art2 = new PrintArt("Nature Sketch", "Anita", 1000, "Print License");

        art1.purchase(user);
        art1.license();

        art2.purchase(user);
        art2.license();

        System.out.println("Remaining Balance: " + user.walletBalance);
    }
}
