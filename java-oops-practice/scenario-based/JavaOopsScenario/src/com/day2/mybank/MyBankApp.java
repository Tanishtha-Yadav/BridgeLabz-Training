package com.day2.mybank;

public class MyBankApp {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount("SB101", 10000);
        Account acc2 = new CurrentAccount("CA201");

        acc1.deposit(2000);
        acc2.deposit(5000);

        acc1.withdraw(1500);
        acc2.withdraw(1000);

        System.out.println("Savings Balance: " + acc1.checkBalance());
        System.out.println("Savings Interest: " + acc1.calculateInterest());

        System.out.println("Current Balance: " + acc2.checkBalance());
        System.out.println("Current Interest: " + acc2.calculateInterest());
    }
}
