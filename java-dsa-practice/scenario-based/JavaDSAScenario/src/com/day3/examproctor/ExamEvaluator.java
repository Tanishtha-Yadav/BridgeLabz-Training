package com.day3.examproctor;

import java.util.HashMap;

class ExamEvaluator {

    static int evaluate(HashMap<Integer, String> student,
                        HashMap<Integer, String> correct) {

        int score = 0;

        for (int qid : correct.keySet()) {
            if (correct.get(qid).equals(student.get(qid))) {
                score++;
            }
        }
        return score;
    }
}
