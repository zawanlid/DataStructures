package com.designpattern.hashtable;

public class AppHashTable {
    public static void main(String[] args) {

        hashKey("123456-A", 100);


    }
    private static int hashKey(String key, int size) {
        int hashKey = 0;
        for (char c: key.toCharArray())
            hashKey += c;

        return hashKey % size;
    }
}
