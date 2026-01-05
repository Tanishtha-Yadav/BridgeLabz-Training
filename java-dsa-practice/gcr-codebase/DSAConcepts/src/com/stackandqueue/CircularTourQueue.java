package com.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

class PetrolPump {
    int petrol, distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTourQueue {

    public static int findStartingPump(PetrolPump[] pumps) {
        int n = pumps.length;

        Queue<PetrolPump> queue = new LinkedList<>();
        for (PetrolPump pump : pumps)
            queue.add(pump);

        for (int start = 0; start < n; start++) {
            int surplus = 0;
            boolean completed = true;

            for (PetrolPump pump : queue) {
                surplus += pump.petrol - pump.distance;
                if (surplus < 0) {
                    completed = false;
                    break; // cannot complete from this start
                }
            }

            if (completed)
                return start;

            // Rotate the queue: move first pump to the end
            queue.add(queue.poll());
        }

        return -1; // no solution
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int start = findStartingPump(pumps);
        if (start != -1)
            System.out.println("Start at pump index: " + start);
        else
            System.out.println("No solution possible");
    }
}

