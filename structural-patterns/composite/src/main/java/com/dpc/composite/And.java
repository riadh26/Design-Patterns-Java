package com.dpc.composite;

public class And extends Binary {

    public And(Predicate left, Predicate right) {
        super(left, right);
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() && right.evaluate();
    }
}
