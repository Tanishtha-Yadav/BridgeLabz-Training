package com.linkedlist.circularlinkedlist.taskmanagement;

class TaskNode {
    int taskId;
    String taskName, dueDate;
    int priority;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.taskId = id;
        this.taskName = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = this;
    }
}

public class TaskScheduler {
    TaskNode head, current;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = current = newNode;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = current = newNode;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Task ID
    void removeByTaskId(int id) {
        if (head == null) return;

        TaskNode temp = head, prev = null;

        do {
            if (temp.taskId == id) {
                if (prev != null)
                    prev.next = temp.next;
                else {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // View current task and move to next
    void viewNextTask() {
        if (current == null) return;
        System.out.println("Current Task: " + current.taskName);
        current = current.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName +
                    " Priority:" + temp.priority + " Due:" + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Priority
    void searchByPriority(int p) {
        if (head == null) return;
        TaskNode temp = head;
        do {
            if (temp.priority == p)
                System.out.println(temp.taskName + " Due:" + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
    	TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Assignment", 1, "10-Feb");
        scheduler.addAtEnd(2, "Project", 2, "20-Feb");
        scheduler.addAtBeginning(3, "Exam Prep", 1, "5-Feb");

        scheduler.displayAll();
        scheduler.viewNextTask();
        scheduler.searchByPriority(1);
        scheduler.removeByTaskId(2);

        System.out.println("After Deletion:");
        scheduler.displayAll();
    }
}

