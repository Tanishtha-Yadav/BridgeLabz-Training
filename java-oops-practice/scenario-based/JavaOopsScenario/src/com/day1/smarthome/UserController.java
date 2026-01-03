package com.day1.smarthome;

class UserController {
    public void controlAppliance(Controllable appliance, boolean turnOn) {
        if (turnOn) {
            appliance.turnOn();
        } else {
            appliance.turnOff();
        }
    }

    public void comparePower(Appliance a1, Appliance a2) 
    {
        if (a1.getPower() > a2.getPower()) 
        {
            System.out.println(a1.getName() + " uses more power than " + a2.getName());
        } 
        else if (a1.getPower() < a2.getPower())
        {
            System.out.println(a1.getName() + " uses less power than " + a2.getName());
        } 
        else 
        {
            System.out.println(a1.getName() + " and " + a2.getName() + " use equal power");
        }
    }
}
