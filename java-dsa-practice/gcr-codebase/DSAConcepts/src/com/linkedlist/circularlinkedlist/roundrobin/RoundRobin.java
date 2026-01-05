package com.linkedlist.circularlinkedlist.roundrobin;

class ProcessNode {
    int pid, burstTime, remainingTime, priority;
    ProcessNode next;

    ProcessNode(int pid, int bt, int priority) {
        this.pid = pid;
        this.burstTime = bt;
        this.remainingTime = bt;
        this.priority = priority;
        this.next = this;
    }
}

public class RoundRobin {
    ProcessNode head = null;
    int timeQuantum;

    RoundRobin(int tq) {
        timeQuantum = tq;
    }

    // Add process at end
    void addProcess(int pid, int bt, int priority) {
        ProcessNode newNode = new ProcessNode(pid, bt, priority);
        if (head == null) {
            head = newNode;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove process by PID
    void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode temp = head, prev = null;
        do {
            if (temp.pid == pid) {
                if (prev != null)
                    prev.next = temp.next;
                else {
                    ProcessNode last = head;
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

    // Display circular queue
    void displayQueue() {
        if (head == null) return;
        ProcessNode temp = head;
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Round Robin Scheduling
    void schedule() {
        int time = 0, completed = 0;
        int n = countProcesses();
        int totalWaiting = 0, totalTurnaround = 0;

        ProcessNode curr = head;

        while (completed < n) {
            if (curr.remainingTime > 0) {
                int exec = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= exec;
                time += exec;

                if (curr.remainingTime == 0) {
                    completed++;
                    int turnaround = time;
                    int waiting = turnaround - curr.burstTime;
                    totalTurnaround += turnaround;
                    totalWaiting += waiting;
                }
                displayQueue();
            }
            curr = curr.next;
        }

        System.out.println("Average Waiting Time = " + (double) totalWaiting / n);
        System.out.println("Average Turnaround Time = " + (double) totalTurnaround / n);
    }

    int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin(2);

        rr.addProcess(1, 5, 1);
        rr.addProcess(2, 3, 2);
        rr.addProcess(3, 4, 1);

        rr.displayQueue();
        rr.schedule();
    }
}
