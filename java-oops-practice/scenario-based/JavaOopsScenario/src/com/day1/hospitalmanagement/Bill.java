package com.day1.hospitalmanagement;

class Bill implements Payable {
    double baseAmount;

    Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    private double calculateDiscount() {
        return baseAmount * 0.10;
    }

    private double calculateTax(double amount) {
        return amount * 0.05;
    }

    @Override
    public double calculatePayment() {
        double discounted = baseAmount - calculateDiscount();
        return discounted + calculateTax(discounted);
    }
}
