package com.example.interviewpreparation.geeks_for_geeks;

public class SubstringGenerator {

    public static void main(String[] args) {
        String input = "abc";
        int offset = 0;
        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j <= input.length(); j++) {
                if (j + offset <= input.length()) {
                    System.out.println(input.substring(j, j + offset));
                }
            }
            offset++;
        }
    }

}
