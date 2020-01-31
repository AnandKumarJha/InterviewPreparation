package com.example.interviewpreparation.design_pattern;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int rollNum;

    public Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}

interface Iterator {
    boolean hasNext();

    Student next();
}

class StudentList {
    private List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public Iterator iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator {
        int position = 0;

        @Override
        public boolean hasNext() {
            return position < students.size();
        }

        @Override
        public Student next() {
            return students.get(position++);
        }
    }
}

public class IteratorDesignPattern {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new Student("anand", 1));
        studentList.add(new Student("anand2", 2));
        studentList.add(new Student("anand3", 3));
        studentList.add(new Student("anand4", 4));

        Iterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
