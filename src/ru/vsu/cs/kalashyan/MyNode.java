package ru.vsu.cs.kalashyan;

public class MyNode<T> {

    private T value;
    private MyNode<T> next;

    public MyNode(T value, MyNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public MyNode() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + (next == null ? " " : next.getValue()) + //
                '}';
    }
}