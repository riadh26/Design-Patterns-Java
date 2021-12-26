package com.dpc.templatemethod;

public class SinglyLinkedList<T> extends SequentialSearch<T> {

    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;

    public SinglyLinkedList() {
        super();
    }

    @Override
    protected void start() {
        this.current = head;
    }

    @Override
    protected T current() {
        return current.getData();
    }

    @Override
    protected void next() {
        current = current.getNext();
    }

    @Override
    protected boolean beyond() {
        return current == null;
    }

    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            setHead(newNode);
        } else {
            tail.setNext(newNode);
        }
        setTail(newNode);
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
