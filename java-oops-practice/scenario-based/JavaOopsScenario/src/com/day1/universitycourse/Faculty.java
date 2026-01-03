package com.day1.universitycourse;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void gradeStudent(Graded enrollment, String grade) {
        enrollment.assignGrade(grade);
    }
}
	