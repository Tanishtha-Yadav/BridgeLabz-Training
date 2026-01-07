package com.day4.fittrack;


	
	class CardioWorkout extends Workout {

	    CardioWorkout(int duration) {
	        super("Cardio", duration);
	    }

	    @Override
	    int calculateCalories() {
	        caloriesBurned = duration * 8; // higher burn
	        return caloriesBurned;
	    }
	}



