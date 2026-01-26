package com.regex.advanced;

import java.util.regex.Pattern;

public class IPAddressValidator {

    public static boolean isValidIP(String ip) {

        String regex =
            "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
          + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {

        System.out.println(isValidIP("192.168.1.1"));   // true
        System.out.println(isValidIP("255.255.255.0")); // true
        System.out.println(isValidIP("256.10.10.1"));   // false
        System.out.println(isValidIP("192.168.1"));     // false
        System.out.println(isValidIP("192.168.01.1"));  // false
    }
}
