package com.day1.smarthome;

class Light extends Appliance {

    public Light(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " Light is ON");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " Light is OFF");
    }
}

class Fan extends Appliance {

    public Fan(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " Fan is spinning");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " Fan is stopped");
    }
}

class AC extends Appliance {

    public AC(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " AC is cooling");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " AC is turned off");
    }
}
