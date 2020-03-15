package com.example.interviewpreparation.geeks_for_geeks.stack;

public class StackReverse {
    public static void main(String[] args){
        StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();
        stackWithLinkedList.push(3);
        stackWithLinkedList.push(18);
        stackWithLinkedList.push(10);
        stackWithLinkedList.push(15);
        stackWithLinkedList.push(20);
        stackWithLinkedList.printAll();
        reverse(stackWithLinkedList);
        stackWithLinkedList.printAll();
    }

    private static void reverse(StackWithLinkedList stackWithLinkedList){
        if(!stackWithLinkedList.isEmpty()){
            int temp = stackWithLinkedList.pop();
//            System.out.println(temp); //for printing reverse order
            reverse(stackWithLinkedList);
//            System.out.println(temp); //for printing non reverse order
//            stackWithLinkedList.push(temp);
            insertAtBottom(stackWithLinkedList, temp);
        }
    }

    private static void insertAtBottom(StackWithLinkedList stackWithLinkedList, int data){
        if(stackWithLinkedList.isEmpty()){
            stackWithLinkedList.push(data);
        }else{
            int temp = stackWithLinkedList.pop();
            insertAtBottom(stackWithLinkedList,data);
            stackWithLinkedList.push(temp);
        }
    }
}
