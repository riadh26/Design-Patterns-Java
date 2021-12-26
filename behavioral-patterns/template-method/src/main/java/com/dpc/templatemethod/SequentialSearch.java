package dpc.templatemethod.demo;

public abstract class SequentialSearch<T> {

    public final boolean find(T x) {
        start();
        while (!beyond() && current() != x) {
            next();
        }
        return !beyond();
    }

    protected abstract void start();
    protected abstract T current();
    protected abstract void next();
    protected abstract boolean beyond();
}
