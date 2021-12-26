package com.dpc.singleton;

public class Counter {

    private int count;
    private static Counter instance = null;

    private Counter() {
        count = 0;
    }

    public void reinitialize() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    public int value() {
        return count;
    }
}
