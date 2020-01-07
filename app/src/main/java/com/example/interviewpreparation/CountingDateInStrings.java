package com.example.interviewpreparation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingDateInStrings {

    public static void main(String[] args) {

        String s = "This is my date 12-12-1999. This is my date 12-12-1991, 12-12-1989.";
        String datePattern = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(s);
        int count = 0;


        while (matcher.find()) {
            System.out.println("Group : " + matcher.group() + " start : " + matcher.start() + " end : " + matcher.end());
            count++;
        }
        System.out.println("The date is present in the given string is " + count + " times. ");
    }

}
