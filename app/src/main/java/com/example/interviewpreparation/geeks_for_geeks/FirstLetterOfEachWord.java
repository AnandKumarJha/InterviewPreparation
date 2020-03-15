package com.example.interviewpreparation.geeks_for_geeks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterOfEachWord {

    private static void printFirstChar(String s){
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    private static void printFirstChar1(String s){
       String[] strings = s.split(" ");
       for(String single : strings){
           System.out.println(single.charAt(0));
       }
    }

    public static void main(String[] args){
        String s = "Anand kumar Jha";
        printFirstChar(s);
        printFirstChar1(s);
    }

}
