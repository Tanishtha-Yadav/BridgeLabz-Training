package com.encapsulation.bankingsystem;

import java.util.*;

public class BankingTest {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Amit", 20000));
        accounts.add(new CurrentAccount("CA201", "Neha", 50000));

        for (BankAccount acc : accounts) {
            acc.displayAccount();
            System.out.println("Interest: " + acc.calculateInterest());

            Loanable loan = (Loanable) acc;
            System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());

            System.out.println("-----------------------");
        }
    }
}
