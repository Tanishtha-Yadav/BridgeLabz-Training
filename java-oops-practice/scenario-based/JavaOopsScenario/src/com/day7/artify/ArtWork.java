package com.day7.artify;

class Artwork implements IPurchasable {

    String title;
    String artist;
    double price;
    protected String licenseType;   // Encapsulation

    // Constructor without preview
    Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview
    Artwork(String title, String artist, double price, String licenseType, String preview) {
        this(title, artist, price, licenseType);
        // preview logic (not stored for simplicity)
    }

    @Override
    public void purchase(User user) {
        user.walletBalance = user.walletBalance - price; // operator usage
        System.out.println(user.name + " purchased " + title);
    }

    @Override
    public void license() {
        System.out.println("Generic artwork license: " + licenseType);
    }
}
