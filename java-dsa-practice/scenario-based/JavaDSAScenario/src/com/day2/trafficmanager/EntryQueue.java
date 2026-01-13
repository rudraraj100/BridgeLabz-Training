package com.day2.trafficmanager;
import java.util.LinkedList;
import java.util.Queue;

public class EntryQueue {

    private Queue<String> queue = new LinkedList<>();
    private int capacity;

    public EntryQueue(int capacity) {
        this.capacity = capacity;
    }

    // Add vehicle to queue
    public void enqueue(String vehicle) {
        if (queue.size() == capacity) {
            System.out.println("Queue Overflow: Entry blocked");
            return;
        }
        queue.add(vehicle);
    }

    // Remove vehicle from queue
    public String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow: No vehicles waiting");
            return null;
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
