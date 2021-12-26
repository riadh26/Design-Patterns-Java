package com.dpc.composite;

public class Main {

    public static void main(String[] args) {
        Predicate a = new Variable();
        Predicate b = new Variable(true);
        Predicate c = new Variable(true);
        Predicate d = new Variable(true);

        Predicate and1 = new And(a, b);
        Predicate and2 = new And(c, d);
        Predicate or = new Or(and1, and2);
        Predicate not = new Not(a);

        System.out.println(or.evaluate());
        System.out.println(not.evaluate());
    }
}
