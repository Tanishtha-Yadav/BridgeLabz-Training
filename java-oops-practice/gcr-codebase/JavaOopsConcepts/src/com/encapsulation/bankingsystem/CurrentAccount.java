package com.encapsulation.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 1.5;

    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 10;  // higher eligibility
    }
}

