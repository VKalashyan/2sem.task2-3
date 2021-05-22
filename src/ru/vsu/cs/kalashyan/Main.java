package ru.vsu.cs.kalashyan;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);

        System.out.println("Список до удаления элементов с чётным значением:");
        linkedList.print();

        linkedList.removeElementsWithEvenValue();

        System.out.println("Список после удаления элементов с чётным значением:");
        linkedList.print();
    }
}
