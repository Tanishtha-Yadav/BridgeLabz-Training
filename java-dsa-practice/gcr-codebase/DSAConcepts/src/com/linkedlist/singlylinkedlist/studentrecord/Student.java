package com.linkedlist.singlylinkedlist.studentrecord;

class StudentNode 
{
    int rollNo, age;
    String name, grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, String grade) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class Student 
{
    StudentNode head;

    // Add at beginning
    void addAtBeginning(int rollNo, String name, int age, String grade)
    {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int rollNo, String name, int age, String grade) 
    {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, int rollNo, String name, int age, String grade) 
    {
        if (pos == 1) 
        {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    void deleteByRollNo(int rollNo)
    {
        if (head == null) return;

        if (head.rollNo == rollNo) 
        {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Search by Roll Number
    void search(int rollNo)
    {
        StudentNode temp = head;
        while (temp != null) 
        {
            if (temp.rollNo == rollNo) 
            {
                System.out.println("Found: " + temp.name + " Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update Grade
    void updateGrade(int rollNo, String newGrade) 
    {
        StudentNode temp = head;
        while (temp != null) 
        {
            if (temp.rollNo == rollNo) 
            {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all records
    void display() {
        StudentNode temp = head;
        while (temp != null)
        {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) 
    {
        Student list = new Student();

        list.addAtBeginning(1, "Amit", 20, "A");
        list.addAtEnd(2, "Neha", 21, "B");
        list.addAtPosition(2, 3, "Ravi", 19, "A");

        list.display();
        list.search(2);
        list.updateGrade(2, "A+");
        list.deleteByRollNo(1);

        System.out.println("After updates:");
        list.display();
    }
}

