package com.dpc.singleton;

public class Main {

    public static void main(String[] args) {
        Counter.getInstance().increment();
        Counter.getInstance().increment();
        Counter.getInstance().decrement();
        System.out.println("com.dpc.singleton.Counter value = " + Counter.getInstance().value());
    }
}
