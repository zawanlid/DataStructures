package com.structures.queue;

import java.util.Arrays;

public class MyArrayQueue<E> {

    private final int size;
    private int front = 0, end = 0;
    private Object array[];

    public MyArrayQueue(int size) {
        this.size = size;
        array = new Object[size];
    }

    public void enqueue (E item) {
        array[end++] = item;
    }

    public E dequeue () {
        E e = (E) array[front];
        array[front++] = null;
        return e;
    }

    public boolean isEmpty () {
        return end == 0;
    }

    public boolean isFull () {
        return end == size;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(array);
    }
}
