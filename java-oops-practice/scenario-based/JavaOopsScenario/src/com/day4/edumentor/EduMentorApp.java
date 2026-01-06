package com.day4.edumentor;

public class EduMentorApp {

    public static void main(String[] args) {

        Learner learner = new Learner(
                "Tanishtha",
                "tanishtha@edumentor.com",
                101,
                "short"
        );

        Instructor instructor = new Instructor(
                "Dr. Rao",
                "rao@edumentor.com",
                201
        );

        learner.printDetails();
        instructor.printDetails();

        String[] questions = {
                "1. What is OOP?",
                "2. What is Encapsulation?",
                "3. Java is a____"
                
        };

        String[] options = {
                "1) Object Oriented Programming  2) Open Office Program",
                "1) Data Hiding  2) Inheritance",
                "1) OOP language 2) POP language"
        };

        int[] answers = {1, 1, 1};

        Quiz quiz = new Quiz(questions, options, answers);
        quiz.conductQuiz();

        System.out.println("Score Percentage: " + quiz.getPercentage() + "%");

        learner.generateCertificate();
    }
}
