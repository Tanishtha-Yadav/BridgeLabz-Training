package com.day1.walletapplication;

class BusinessWallet extends Wallet {
    private static final double TAX = 0.02;

    public BusinessWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double taxAmount = amount * TAX;
        double total = amount + taxAmount;

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            System.out.println("Business transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
