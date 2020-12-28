package com.structures.queue.priority;

public class AppPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<MyString> pq = new PriorityQueue<MyString>(10);

        pq.add(new MyString(0,"zero"));
        pq.add(new MyString(1,"one"));
        pq.add(new MyString(4,"four"));

        System.out.println(pq.toString());

        pq.add(new MyString(3,"three"));
        pq.add(new MyString(2,"two"));

        System.out.println(pq.toString());

    }

}
