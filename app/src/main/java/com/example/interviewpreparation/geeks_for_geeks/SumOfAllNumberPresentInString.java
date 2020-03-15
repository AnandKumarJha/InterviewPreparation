package com.example.interviewpreparation.geeks_for_geeks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfAllNumberPresentInString {
    public static void main(String[] args) {
        String input = "123abc";
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher(input);
        int sum = 0;
        while (matcher.find()) {
            sum = sum + Integer.parseInt(matcher.group());
        }
        System.out.println("" + sum);
    }
}
