package com.structures.set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemover {
    private String text;

    public DuplicateRemover(String text) {
        this.text = text;
    }

    public String removeDuplicate() {
        Set<Character> set = new HashSet<Character>();
        for (char c:text.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb  = new StringBuilder();
        set.forEach(e -> sb.append(e));

        return sb.toString();

    }
}
