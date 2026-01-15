package com.day3.examproctor;

import java.util.Stack;

class ExamNavigation {

    Stack<Integer> navStack = new Stack<>();

    void visitQuestion(int qid) {
        navStack.push(qid);
        System.out.println("Visited Question: " + qid);
    }

    int goBack() {
        if (navStack.isEmpty()) {
            System.out.println("No previous question");
            return -1;
        }
        return navStack.pop();
    }
}

