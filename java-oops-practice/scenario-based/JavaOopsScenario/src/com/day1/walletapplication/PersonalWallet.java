package com.day1.walletapplication;

class PersonalWallet extends Wallet {

    public PersonalWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Personal transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

