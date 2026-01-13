package com.day2.callcenter;

import java.util.*;

class CallCenter {

    // Queue for normal customers (FIFO)
    private Queue<Customer> normalQueue = new LinkedList<>();

    // PriorityQueue for VIP customers
    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>((a, b) -> a.id - b.id); // simple priority rule

    // HashMap to track number of calls per customer
    private HashMap<Integer, Integer> callCountMap = new HashMap<>();

    // Add incoming call
    public void addCall(Customer customer) {

        // Update call count
        callCountMap.put(customer.id,
                callCountMap.getOrDefault(customer.id, 0) + 1);

        // Add customer to appropriate queue
        if (customer.isVIP) {
            vipQueue.add(customer);   // VIP goes to priority queue
        } else {
            normalQueue.add(customer); // Normal goes to FIFO queue
        }
    }

    // Handle next call
    public void handleNextCall() {
        Customer servedCustomer;

        // VIP customers are served first
        if (!vipQueue.isEmpty()) {
            servedCustomer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            servedCustomer = normalQueue.poll();
        } else {
            System.out.println("No calls to handle");
            return;
        }

        System.out.println("Serving customer: " + servedCustomer.name);
    }

    // Display call count
    public void showCallCount() {
        System.out.println(callCountMap);
    }
}
