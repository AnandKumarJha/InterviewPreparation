package com.example.interviewpreparation.geeks_for_geeks.stack;

public class StackSorting {

    public static void main(String[] args) {

        StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();
        stackWithLinkedList.push(4);
        stackWithLinkedList.push(16);
        stackWithLinkedList.push(50);
        stackWithLinkedList.push(8);
        stackWithLinkedList.push(10);
        stackWithLinkedList.push(7);
        stackWithLinkedList.push(19);
        stackWithLinkedList.push(30);

        stackWithLinkedList.printAll();
        sortStack(stackWithLinkedList);
//        stackWithLinkedList.printAll();
    }

    private static void sortStack(StackWithLinkedList stackWithLinkedList) {
        StackWithLinkedList tempStackWithLinkedList = new StackWithLinkedList();
        while (!stackWithLinkedList.isEmpty()) {
            int data = stackWithLinkedList.pop();
            while (!tempStackWithLinkedList.isEmpty() && tempStackWithLinkedList.peak() < data) {
                stackWithLinkedList.push(tempStackWithLinkedList.pop());
            }
            tempStackWithLinkedList.push(data);
        }
//        stackWithLinkedList.printAll();
        tempStackWithLinkedList.printAll();
    }


}
