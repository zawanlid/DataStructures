package com.designpattern.queue.priority;

public class MyString implements Priority {

    private int priority;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public MyString(int p, String v) {
        this.priority = p;
        this.value = v;
    }

    @Override
    public int priority() {
        return this.priority;
    }
}
