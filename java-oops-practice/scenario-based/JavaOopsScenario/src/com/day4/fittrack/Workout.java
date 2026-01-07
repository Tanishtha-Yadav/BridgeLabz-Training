package com.day4.fittrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    abstract int calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }
}

