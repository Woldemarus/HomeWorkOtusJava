package org.example;


import com.google.common.collect.Queues;
import java.util.Queue;
public class HelloOtus {


    public static void run() {
        // Creating a new instance of a queue using Guava's Queues class


        Queue<String> queue = Queues.newArrayBlockingQueue(3);

        // Adding elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Removing elements from the head of the queue
        String head = queue.remove();
        System.out.println("Removed from head: " + head);

        // Peeking at the head of the queue without removing it
        String peeked = queue.peek();
        System.out.println("Peeked at head: " + peeked);

        // Checking if the queue contains a specific element
        boolean contains = queue.contains("Second");
        System.out.println("Queue contains 'Second': " + contains);

        // Other queue operations can be performed using methods from the Queue interface

    }
}
