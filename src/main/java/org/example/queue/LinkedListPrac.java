package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListPrac {
    // FIFO

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();

        // add person object
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Mariam", 45));
        queue.add(new Person("Ali", 16));

        System.out.println("how many are queueing: " + queue.size());
        // check who's at the front "of the queue"
        // remember, FIFO
        System.out.println(queue.peek());
        // remove the front person from the queue
        System.out.println(queue.poll());
        System.out.println("how many are queueing: " + queue.size());
        System.out.println(queue.peek());


    }


    static record Person(String name, int age) {}
}
