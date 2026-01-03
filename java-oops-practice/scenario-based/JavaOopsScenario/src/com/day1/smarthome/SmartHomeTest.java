package com.day1.smarthome;

public class SmartHomeTest {
    public static void main(String[] args) {

        Appliance light = new Light("Living Room", 60);
        Appliance fan = new Fan("Ceiling", 75);
        Appliance ac = new AC("Bedroom", 1500);

        UserController controller = new UserController();

        controller.controlAppliance(light, true);
        controller.controlAppliance(fan, true);
        controller.controlAppliance(ac, true);

        System.out.println();

        controller.comparePower(fan, light);
        controller.comparePower(ac, fan);

        System.out.println();

        controller.controlAppliance(light, false);
        controller.controlAppliance(fan, false);
        controller.controlAppliance(ac, false);
    }
}
