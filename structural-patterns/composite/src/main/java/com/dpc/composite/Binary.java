package com.dpc.composite;

public abstract class Binary extends Predicate {
    protected Predicate left;
    protected Predicate right;

    protected Binary(Predicate left, Predicate right) {
        super();
        this.left = left;
        this.right = right;
    }
}
