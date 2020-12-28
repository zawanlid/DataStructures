package com.structures.queue;

import java.util.Arrays;

/**
 * Based on MyArrayQueue, addition functionality to consume dequeued memory space to enqueue new items in the array.
 * @param <E>
 */
public class MyCircularArrayQueue<E> {

    private final int size;
    private int first = 0, last = 0, count = 0;
    private Object array[];

    public MyCircularArrayQueue(int size) {
        this.size = size;
        array = new Object[size];
    }

    public void enqueue (E item) {
        array[last] = item;
        last = (last+1) % size;
        count++;
    }

    public E dequeue () {
        E e = (E) array[first];
        array[first] = null;
        first = (first+1) % size;
        count--;
        return e;
    }

    public boolean isEmpty () {
        return count == 0;
    }

    public boolean isFull () {
        return count == size;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(array);
    }
}
