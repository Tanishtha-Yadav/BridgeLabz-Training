package com.day4.fittrack;

class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    int calculateCalories() {
        caloriesBurned = duration * 5;
        return caloriesBurned;
    }
}
