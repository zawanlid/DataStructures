package com.designpattern.stack;

import java.util.Stack;

public class AppStack {

    public static void main(String[] args) {
        String s = "abcdefg";
        StringReversor sr = new StringReversor();
        //sr.reverse("DIL");

        Expression e = new Expression("(a+b)");
        System.out.println(e.isBalanced());
    }

    public static void test1 () {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
    }

}
