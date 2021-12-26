package com.dpc.composite;

public class Variable extends Predicate {
    private boolean value;

    public Variable() { }

    public Variable(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;
    }
}
