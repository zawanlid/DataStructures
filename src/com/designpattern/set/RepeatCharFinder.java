package com.designpattern.set;

import java.util.HashSet;
import java.util.Set;

public class RepeatCharFinder {
    private String text;

    public RepeatCharFinder(String text) {
        this.text = text;
    }

    public char findFirstRepeatedChar () {
        Set<Character> set = new HashSet<>();
        for (char c: text.toCharArray()) {
            if (!set.add(c))
                return c;
        }
        return Character.MIN_VALUE;
    }
}
