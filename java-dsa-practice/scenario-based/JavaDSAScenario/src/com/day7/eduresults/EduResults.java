package com.day7.eduresults;

public class EduResults {
    public static void main(String[] args) {

        Student[] students = {
            new Student(201, 88),
            new Student(202, 95),
            new Student(203, 88),
            new Student(204, 72),
            new Student(205, 90)
        };

        MergeSort.mergeSort(students, 0, students.length - 1);

        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " -> " + s);
        }
    }
}
