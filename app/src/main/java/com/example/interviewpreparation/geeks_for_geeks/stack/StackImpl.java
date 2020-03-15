package com.example.interviewpreparation.geeks_for_geeks.stack;

class StackWithArray {
    private static final int MAX_SIZE = 10;
    private int[] data = new int[10];
    private int position = -1;

    public boolean push(int data1) {
        if (position + 1 < MAX_SIZE) {
            position += 1;
            data[position] = data1;
            return true;
        } else {
            System.out.println("Stack overflow!");
            return false;
        }
    }

    public int pop() {
        if (position < 0) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
            return data[position--];
        }
    }

    public int peak() {
        return data[position];
    }

    public boolean isEmpty() {
        return position == -1;
    }
}

class StackData {
    int data = -1;
    StackData next;
}

class StackWithLinkedList {
    private StackData head;

    public int peak() {
        return head.data;
    }

    public boolean push(int data) {

        StackData stackData = new StackData();
        stackData.data = data;
        if (head == null) {
            head = stackData;
        } else {
            StackData temp = head;
            head = stackData;
            stackData.next = temp;
        }
        return true;
    }

    public int pop() {
        int data_popped = -1;
        if (head != null) {
            data_popped = head.data;
            head = head.next;
        }
        return data_popped;
    }

    public boolean isEmpty() {
        return head==null;
    }

    public void printAll(){
        System.out.println("Printing all elements --------------------");
        StackData tempStackData = head;
        while (tempStackData!=null && tempStackData.next!=null){
            System.out.println(tempStackData.data);
            tempStackData = tempStackData.next;
        }
    }
}

class A {
    String myData;
}

public class StackImpl {
    public static void main(String[] args) {
//        StackWithArray stack = new StackWithArray();

      /*  A a = new A();
        a.myData = "asdf";
        System.out.println(a.myData);

        A c = a;
        a.myData = "sss";
        System.out.println(c.myData);

        c.myData = "aa";
        System.out.println(c.myData);
        System.out.println(a.myData);

        A b = new A();
        b.myData = "uuuu";
        System.out.println(a.myData);

        a = b;
        System.out.println("------------------");
        System.out.println(c.myData);
        System.out.println(a.myData);*/

        StackWithLinkedList stack = new StackWithLinkedList();
        System.out.println("isEmpty : " + stack.isEmpty());
        System.out.println("Push : " + stack.push(5));
        System.out.println("Push : " + stack.push(8));
        System.out.println("isEmpty : " + stack.isEmpty());
        System.out.println("Peak : " + stack.peak());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Peak : " + stack.peak());
        System.out.println("Pop : " + stack.pop());
        System.out.println("isEmpty : " + stack.isEmpty());

        System.out.println("Push : " + stack.push(1));
        System.out.println("Push : " + stack.push(2));
        System.out.println("Push : " + stack.push(3));
        System.out.println("Push : " + stack.push(4));
        System.out.println("Push : " + stack.push(5));
        System.out.println("Push : " + stack.push(6));
        System.out.println("Push : " + stack.push(7));
        System.out.println("Push : " + stack.push(8));
        System.out.println("Push : " + stack.push(9));
        System.out.println("Push : " + stack.push(10));
        System.out.println("Push : " + stack.push(11));
        System.out.println("Push : " + stack.push(12));
    }
}
