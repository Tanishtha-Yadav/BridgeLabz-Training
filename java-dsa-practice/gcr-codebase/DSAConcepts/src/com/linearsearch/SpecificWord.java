package com.linearsearch;

import java.util.Scanner;

public class SpecificWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        // Input strings
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        // Target word
        System.out.print("Enter word to search: ");
        String target = sc.nextLine();

        boolean found = false;

        // Linear search
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(target)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, word found.");
        } else {
            System.out.println("No, word not found.");
        }

        sc.close();
    }
}

