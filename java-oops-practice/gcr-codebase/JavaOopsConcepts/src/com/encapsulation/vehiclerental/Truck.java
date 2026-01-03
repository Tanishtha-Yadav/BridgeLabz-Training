package com.encapsulation.vehiclerental;

class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000;   
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Applied";
    }
}

