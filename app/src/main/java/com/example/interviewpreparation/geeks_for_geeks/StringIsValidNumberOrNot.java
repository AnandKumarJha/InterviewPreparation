package com.example.interviewpreparation.geeks_for_geeks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIsValidNumberOrNot {
    public static void main(String[] args) {
        String input = "3.4e43";
        Pattern pattern = Pattern.compile("[0-9]+(\\.[0-9]+)?([eE][0-9]+)?");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid Number");
        } else {
            System.out.println("InValid Number");
        }
    }
}
