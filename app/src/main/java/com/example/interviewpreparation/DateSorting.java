package com.example.interviewpreparation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class DateSorting {
    public static void main(String args[]){
        ArrayList<Student> students = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            students.add(new Student(1, "Anand", 123456, simpleDateFormat.format(simpleDateFormat.parse("8/8/1996"))));
            students.add(new Student(2, "Aman", 859632, simpleDateFormat.format(simpleDateFormat.parse("8/8/1991"))));
            students.add(new Student(2, "Aman", 8596, simpleDateFormat.format(simpleDateFormat.parse("9/8/1991"))));
            students.add(new Student(3, "Mamam", 897564, simpleDateFormat.format(simpleDateFormat.parse("12/9/1991"))));
            students.add(new Student(4, "Abhishek", 520696, simpleDateFormat.format(simpleDateFormat.parse("26/6/1991"))));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                //roll num ascending
//                return student.id<t1.id ? -1 : (student.id==t1.id ? 0 : 1) ;

                //roll num descending
//                return student.id>t1.id ? 1 : (student.id==t1.id ? 0 : -1) ;

                //name decending
//                return (student.name.compareTo(t1.name)*-1);

                //name ascending
//                return student.name.compareTo(t1.name);

                //ascending date
//                return student.dateOfBirth.compareTo(t1.dateOfBirth);

                //descending date
                return t1.dateOfBirth.compareTo(student.dateOfBirth);
            }
        });

        System.out.println(students);
    }
}