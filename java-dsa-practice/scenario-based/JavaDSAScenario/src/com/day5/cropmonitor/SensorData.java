package com.day5.cropmonitor;

class SensorData {
    long timestamp;     // epoch time
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    public String toString() {
        return timestamp + " -> " + temperature + "°C";
    }
}
