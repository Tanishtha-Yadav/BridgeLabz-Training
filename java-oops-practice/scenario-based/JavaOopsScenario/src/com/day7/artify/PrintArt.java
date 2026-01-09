package com.day7.artify;

class PrintArt extends Artwork {

    PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void license() {
        System.out.println("PrintArt License: Limited prints only");
    }
}

