package com.structures.queue;

import java.util.Stack;

public class QueueWithTwoStack <E>  {

    private Stack<E> stack1 = new Stack<>();
    private Stack<E> stack2 = new Stack<>();

    public void add (E item) {
        stack1.add(item);
    }

    public E remove () {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
