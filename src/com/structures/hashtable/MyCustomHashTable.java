package com.structures.hashtable;

import java.util.LinkedList;

public class MyCustomHashTable {

    private final int size;
    private LinkedList<Entry>[] entries;

    public MyCustomHashTable(int size) {

        this.size = size;
        entries = new LinkedList[size];
    }

    private class Entry {
        private int key;
        private String value;

        private Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hashKey(int key) {
        return Math.abs(key) % size;
    }

    public void put (int key, String value) {
        int index = hashKey(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<Entry>();

        LinkedList<Entry> bucket= entries[index];
        for (Entry e: bucket) {
            if (key == e.key) {
                e.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key,value));

    }

    public String get (int key) {
        int index = hashKey(key);
        if (entries[index] == null) {
            throw new IndexOutOfBoundsException();
        } else {
            for (Entry e : entries[index]) {
                if (key == e.key)
                    return e.value;
            }
        }
        return  null;
    }

}
