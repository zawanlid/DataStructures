package com.designpattern.queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue<T> {
    private Queue<T> queue;

    public ReverseQueue(Queue<T> queue) {
        this.queue = queue;
    }

    public void reverse () {
        Stack<T> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
