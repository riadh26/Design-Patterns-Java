package com.dpc.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class Array<T> extends SequentialSearch<T> {

    private final List<T> array;
    private int counter;

    public Array() {
        super();
        this.array = new ArrayList<>();
    }

    @Override
    protected void start() {
        this.counter = 0;
    }

    @Override
    protected T current() {
        return this.array.get(counter);
    }

    @Override
    protected void next() {
        this.counter++;
    }

    @Override
    protected boolean beyond() {
        return this.counter >= array.size();
    }
    
    public void add(T data) {
        this.array.add(data);
    }
}
