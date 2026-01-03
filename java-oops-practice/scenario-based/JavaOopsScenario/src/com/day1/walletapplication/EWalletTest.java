package com.day1.walletapplication;

public class EWalletTest {
    public static void main(String[] args) {

       
        Wallet personalWallet = new PersonalWallet(5000);  
        Wallet businessWallet = new BusinessWallet(10000);

        User tanishtha = new User("Tanishtha", personalWallet);
        User raman = new User("Raman", personalWallet); 
        User ricr = new User("RICR", businessWallet);

        System.out.println("Initial Balances:");
        System.out.println("Tanishtha: ₹" + tanishtha.getWallet().getBalance());
        System.out.println("Bob: ₹" + raman.getWallet().getBalance());
        System.out.println("Company: ₹" + ricr.getWallet().getBalance());

        tanishtha.getWallet().transferTo(raman, 2000); 
        ricr.getWallet().transferTo(tanishtha, 3000); 
        raman.getWallet().transferTo(tanishtha, 2500);

        System.out.println("Balances After Transfers:");
        System.out.println("Alice: ₹" + tanishtha.getWallet().getBalance());
        System.out.println("Bob: ₹" + raman.getWallet().getBalance());
        System.out.println("Company: ₹" + ricr.getWallet().getBalance());
    }
}

