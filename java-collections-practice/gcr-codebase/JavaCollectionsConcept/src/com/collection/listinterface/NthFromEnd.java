package com.collection.listinterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;

        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        // Move fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (!fast.hasNext()) {
                System.out.println("N is larger than list size");
                return;
            }
            fast.next();
        }

        // Move both pointers until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        System.out.println("Nth element from end: " + slow.next());
    }
}
