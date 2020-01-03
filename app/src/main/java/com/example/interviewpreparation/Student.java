package com.example.interviewpreparation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    int id;
    String name;
    long rollNum;
    Date dateOfBirth;
    SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Student(int id, String name, long rollNum, String date) {
        this.id = id;
        this.name = name;
        this.rollNum = rollNum;
        try {
            this.dateOfBirth = mSimpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "\n"+id + ", " + name + ", " + rollNum + ", " + mSimpleDateFormat.format(dateOfBirth);
    }
}
