package com.day4.fittrack;

public class FitTrackApp {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Tanishtha", 21, 58.5, 1800);
        user.showProfile();

        Workout workout1 = new CardioWorkout(30);
        Workout workout2 = new StrengthWorkout(40);

        workout1.startWorkout();
        int c1 = workout1.calculateCalories();
        workout1.stopWorkout();

        workout2.startWorkout();
        int c2 = workout2.calculateCalories();
        workout2.stopWorkout();

        int totalBurned = c1 + c2;

        // Operator usage
        int progress = user.getDailyTarget() - totalBurned;

        System.out.println("Calories Burned Today: " + totalBurned);
        System.out.println("Remaining Calories to Target: " + progress);
    }
}

