package com.designpattern.queue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class AppQueue {
    public static void main(String[] args) {

        AppQueue aq = new AppQueue();

        aq.testQWTS();


    }

    private void testQWTS () {
        QueueWithTwoStack<String> qwts = new QueueWithTwoStack<>();

        qwts.add("one");
        qwts.add("two");
        System.out.println(qwts.remove());
        System.out.println(qwts.remove());

        qwts.add("three");
        System.out.println(qwts.remove());
    }

    private void testMyCircularArrayQueue () {
        MyCircularArrayQueue<Integer> queue = new MyCircularArrayQueue<Integer>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue);
        queue.enqueue(70);
        System.out.println(queue);
        System.out.println(queue.isFull());
    }
}
