package com.day4.examcell;

public class ExamCell {
    public static void main(String[] args) {

        Student[] students = {
            new Student(101, 88),
            new Student(102, 95),
            new Student(103, 72),
            new Student(104, 95),
            new Student(105, 81)
        };

        MergeSort.mergeSort(students, 0, students.length - 1);

        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " -> " + s);
        }
    }
}

