package com.designpattern.stack;

import java.util.Stack;

public class StringReversor {

    public void reverse(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c: input.toCharArray())
            stack.push(c);

        StringBuilder sb = new StringBuilder();
        while (!stack.empty())
            sb.append(stack.pop());

        System.out.println(sb.toString());
    }

}
