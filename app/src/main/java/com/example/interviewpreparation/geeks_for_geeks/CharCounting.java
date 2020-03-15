package com.example.interviewpreparation.geeks_for_geeks;

public class CharCounting {
    public static void main(String[] args) {
        String input = "#GeeKs01fOr@gEEks07";
        int capCount = 0, lowerCount = 0, numCount = 0, specialCharCount = 0;
        char c;

        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                capCount++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("capCount : " + capCount + ", lowerCount : " + lowerCount + ", numCount" + numCount + ", specialCharCount" + specialCharCount);
    }
}
