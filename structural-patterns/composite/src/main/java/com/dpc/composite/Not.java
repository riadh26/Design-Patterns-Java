package com.dpc.composite;

public class Not extends Unary {

    public Not(Predicate operand) {
        super(operand);
    }

    @Override
    public boolean evaluate() {
        return !operand.evaluate();
    }
}
