package com.structures.hashtable;

import java.util.HashMap;

public class AppHashTable {
    public static void main(String[] args) {

        MyCustomHashTable table = new MyCustomHashTable(10);
        table.put(101,"One-O-One");
        table.put(1,"One");
        table.put(10,"Ten");
        table.put(8,"Eight");
        System.out.println("Done");

    }
    private static void testDummy () {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        System.out.println(map);
        map.get(1);
        map.remove(1);
        System.out.println(map);
    }
    private static int hashKey(String key, int size) {
        int hashKey = 0;
        for (char c: key.toCharArray())
            hashKey += c;

        return hashKey % size;
    }
}
