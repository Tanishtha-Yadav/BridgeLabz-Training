package com.day4.edumentor;

import java.util.Scanner;

public class Quiz {

    private String[] questions;        
    private String[] options;
    private final int[] answers;      
    private int score;

    public Quiz(String[] questions, String[] options, int[] answers) {
        this.questions = questions;
        this.options = options;
        this.answers = answers;
    }

    public void conductQuiz() {
        Scanner sc = new Scanner(System.in);
        score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            int userAnswer = sc.nextInt();

            if (userAnswer == answers[i]) {
                score++;
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / questions.length;
    }
}
