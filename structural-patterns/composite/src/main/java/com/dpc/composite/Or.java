package com.dpc.composite;

public class Or extends Binary {

    public Or(Predicate left, Predicate right) {
        super(left, right);
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() || right.evaluate();
    }
}
