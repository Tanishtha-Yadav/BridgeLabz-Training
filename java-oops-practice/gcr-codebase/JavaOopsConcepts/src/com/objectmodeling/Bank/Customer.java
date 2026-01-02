package com.objectmodeling.Bank;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void viewBalance(Account account) {
        System.out.println(name + "'s balance: ₹" + account.getBalance());
    }

    public String getName() {
        return name;
    }
}
