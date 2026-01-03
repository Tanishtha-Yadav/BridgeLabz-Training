package com.day1.universitycourse;

class Enrollment implements Graded {
    Student student;
    Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    private double convertGradeToPoint(String grade) {
        switch (grade) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            default: return 0.0;
        }
    }

    @Override
    public void assignGrade(String grade) {
        double gradePoint = convertGradeToPoint(grade);
        student.updateGPA(gradePoint, course.credits);
    }
}
