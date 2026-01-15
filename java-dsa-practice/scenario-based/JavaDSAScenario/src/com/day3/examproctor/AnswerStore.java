package com.day3.examproctor;

import java.util.HashMap;

class AnswerStore {

    HashMap<Integer, String> answers = new HashMap<>();

    void saveAnswer(int qid, String answer) {
        answers.put(qid, answer);
    }

    String getAnswer(int qid) {
        return answers.get(qid);
    }
}

