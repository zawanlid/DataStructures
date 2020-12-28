package com.designpattern.hashtable;

import java.util.HashMap;

public class FindCharacter {
    private String text;

    public FindCharacter(String text) {
        this.text = text;
    }
    
    public char findFirstNonRepeatedChar () {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: text.toCharArray()) {
            if (map.get(c) != null)
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        for (char c: text.toCharArray()) {
            if (map.get(c) == 1)
                return c;
        }
        return ' ';

    }
}
