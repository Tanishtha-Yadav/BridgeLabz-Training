package com.day7.artify;

class DigitalArt extends Artwork {

    DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void license() {
        System.out.println("DigitalArt License: Personal / Commercial use");
    }
}
