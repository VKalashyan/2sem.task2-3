package ru.vsu.cs.kalashyan;

public class MyLinkedList<T> {

    private MyNode<T> head;
    private int size;

    public MyNode<T> getHead() {
        return head;
    }

    public void setHead(MyNode<T> head) {
        this.head = head;
    }

    public MyLinkedList() {
        size = 0;
        head = null;
    }

    public void print() {
        String result = "";
        int i = 1;

        if (isEmpty()) System.out.println("Список пуст");
        MyNode<T> current = head;

        while (current != null) {
            result += i + ". " + current.toString() + "\n";
            current = current.getNext();
            i++;
        }

        System.out.println(result);
    }

    public MyNode<T> get(int index) {
        MyNode<T> current = head;

        int i = 0;
        while (i < index) {
            current = current.getNext();
            i++;
        }

        return current;
    }


    public boolean add(T value) {
        MyNode<T> newNode = new MyNode<>();
        newNode.setValue(value);
        //newNode.setNext(null);

        if (isEmpty()) {
            head = newNode;
        } else {
            MyNode<T> last = get(size - 1);
            last.setNext(newNode);
        }

        this.size++;
        return true;
    }

    public boolean remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return true;
        }

        if (index == size - 1) {
            MyNode<T> penultimateElement = get(index - 1);
            penultimateElement.setNext(null);
            size--;
            return true;
        }

        MyNode<T> penultimateElement = get(index - 1);
        MyNode<T> nextExistingElement = get(index + 1);
        penultimateElement.setNext(nextExistingElement);

        size--;
        return true;
    }

    public int getCount() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void removeElementsWithEvenValue() {
        for (int i = 0; i < getCount(); i++) {
            MyNode<T> current = get(i);

            if ((int) current.getValue() % 2 == 0) {
                remove(i);
                i--;
            }
        }
    }
}