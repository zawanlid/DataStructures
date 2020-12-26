package com.designpattern.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> openBr = Arrays.asList('{', '[', '(', '<');
    private final List<Character> closeBr = Arrays.asList('}', ']', ')', '>');
    private final String  exp;

    public Expression(String exp) {
        this.exp = exp;
    }

    public boolean isBalanced () {
        Stack<Character> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (openBr.contains(c))
                stack.push(c);
            if (closeBr.contains(c)) {
                if (stack.isEmpty()) return false;

                if (isBracketsMatch(stack.peek(), c))
                    stack.pop();
            }

        }
        return stack.empty();
    }
    private boolean isBracketsMatch (char open, char close) {
        return openBr.indexOf(open) == closeBr.indexOf(close);
    }
}
