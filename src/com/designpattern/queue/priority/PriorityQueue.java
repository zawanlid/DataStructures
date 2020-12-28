package com.designpattern.queue.priority;

import com.designpattern.queue.priority.Priority;

import java.util.Arrays;

public class PriorityQueue <E extends Priority> {

    private int size;
    private Object [] queue;
    int first = 0, last = 0;

    public PriorityQueue(int size) {
        this.size = size;
        queue = new Object[size];
    }
    public PriorityQueue () {
        this.size = 5;
    }

    public void add (E item) {
        int p = item.priority();
        if (p >= size)
            throw new ArrayIndexOutOfBoundsException();
        if (last == 0) {
            queue[last++] = item;
            return;
        }
        for (int i=last; i>first; i--) {

            if (((E)queue[i-1]).priority() > item.priority()) {
                queue[i] = queue[i-1];
            }
            else {
                queue[i] = item;
                last++;
                return;
            }
        }
    }

    public E remove () {
        return (E) queue[first++];
    }


}
