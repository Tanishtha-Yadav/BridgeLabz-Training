package com.encapsulation.vehiclerental;

class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;  

    Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;   
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Applied";
    }
}
