package com.day3.examproctor;

import java.util.*;

public class ExamProctor {

    public static void main(String[] args) {

        ExamNavigation nav = new ExamNavigation();
        AnswerStore store = new AnswerStore();

        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        // Navigation
        nav.visitQuestion(1);
        store.saveAnswer(1, "A");

        nav.visitQuestion(2);
        store.saveAnswer(2, "C");

        nav.visitQuestion(3);
        store.saveAnswer(3, "C");

        // Submit exam
        int score = ExamEvaluator.evaluate(store.answers, correctAnswers);
        System.out.println("Final Score: " + score);
    }
}

