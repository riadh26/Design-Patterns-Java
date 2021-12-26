package com.dpc.composite;

public abstract class Unary extends Predicate {
    protected Predicate operand;

    protected Unary(Predicate operand) {
        super();
        this.operand = operand;
    }
}
