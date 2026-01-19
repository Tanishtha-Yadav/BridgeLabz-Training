package com.day5.cropmonitor;

public class CropMonitor {
    public static void main(String[] args) {

        SensorData[] data = {
            new SensorData(1705601200L, 28.4),
            new SensorData(1705601100L, 27.9),
            new SensorData(1705601500L, 29.1),
            new SensorData(1705601000L, 26.8)
        };

        QuickSort.quickSort(data, 0, data.length - 1);

        for (SensorData s : data)
            System.out.println(s);
    }
}

