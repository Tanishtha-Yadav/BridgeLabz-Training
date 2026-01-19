package com.day6.artexpo;

public class ArtExpo {
    public static void main(String[] args) {

        Artist[] artists = {
            new Artist("Riya", 45),
            new Artist("Aman", 10),
            new Artist("Neha", 30),
            new Artist("Karan", 50)
        };

        InsertionSort.sort(artists);

        for (Artist a : artists)
            System.out.println(a);
    }
}
