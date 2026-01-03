package com.encapsulation.vehiclerental;

import java.util.*;

public class VehicleRentalTest {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH01AB1234", 1500, "CAR123"));
        vehicles.add(new Bike("MH02CD5678", 500, "BIKE456"));
        vehicles.add(new Truck("MH03EF9012", 3000, "TRUCK789"));

        int days = 3;

        for (Vehicle v : vehicles) {
            v.displayVehicle();
            System.out.println("Rental Cost: " + v.calculateRentalCost(days));

            Insurable ins = (Insurable) v;
            System.out.println(ins.getInsuranceDetails());
            System.out.println("Insurance Cost: " + ins.calculateInsurance());

            System.out.println("-------------------------");
        }
    }
}

