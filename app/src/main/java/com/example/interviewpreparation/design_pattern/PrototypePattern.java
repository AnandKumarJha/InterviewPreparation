package com.example.interviewpreparation.design_pattern;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class Employees implements Cloneable {

    private List<String> emp;

    public Employees() {
        emp = new ArrayList<>();
    }

    public void addEmployee(String employee) {
        emp.add(employee);
    }

    @Nullable
    @Override
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : emp){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}

class MyClass implements Cloneable{
    String name, roll_num;

    public MyClass(String name, String roll_num) {
        this.name = name;
        this.roll_num = roll_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(String roll_num) {
        this.roll_num = roll_num;
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name : "+name+", Roll Number : "+roll_num;
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("anand");
        employees.addEmployee("kumar");
        employees.addEmployee("jha");

        Employees employees1 = (Employees) employees.clone();
        employees1.addEmployee("Rohit");

        System.out.println(employees);
        System.out.println(employees1);

        MyClass myClass = new MyClass("anand", "133");
        MyClass myClass1 = null;
        try {
            myClass1 = (MyClass) myClass.clone();
            myClass1.setName("aaas");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(myClass);
        System.out.println(myClass1);
    }
}
