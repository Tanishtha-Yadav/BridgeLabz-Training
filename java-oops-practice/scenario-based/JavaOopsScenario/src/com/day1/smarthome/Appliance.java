package com.day1.smarthome;

abstract class Appliance implements Controllable {
    private String name;
    private boolean isOn;
    private int power; 

    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
        this.isOn = false; 
    }

    public int getPower() {
        return power;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean on) {
        isOn = on;
    }

    public String getName() {
        return name;
    }
}
