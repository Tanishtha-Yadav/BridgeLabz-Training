package com.objectmodeling.Bank;

public class Association {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank");
        Customer customer = new Customer("Ravi");

        Account acc1 = bank.openAccount(customer, 5000);
        Account acc2 = bank.openAccount(customer, 12000);

        customer.viewBalance(acc1);
        customer.viewBalance(acc2);
    }
}
