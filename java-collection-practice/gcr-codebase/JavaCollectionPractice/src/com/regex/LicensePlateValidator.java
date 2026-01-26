package com.regex;
import java.util.regex.Pattern;

public class LicensePlateValidator {

    public static boolean isValidPlate(String plate) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return Pattern.matches(regex, plate);
    }

    public static void main(String[] args) {
        System.out.println(isValidPlate("AB1234")); // true
        System.out.println(isValidPlate("A12345")); // false
    }
}
