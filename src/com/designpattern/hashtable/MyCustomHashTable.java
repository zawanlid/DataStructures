package com.designpattern.hashtable;

import java.util.LinkedList;

public class MyCustomHashTable<K,V> {

    private int size;
    private LinkedList<Entry>[] entries = new LinkedList[size];

    public MyCustomHashTable(int size) {
        this.size = size;
    }

    private class Entry {
        private K key;
        private  V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


}
