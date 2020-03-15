package com.example.interviewpreparation.geeks_for_geeks;

import java.util.Arrays;

public class WordReverse {
    public static void main(String[] args) {
        String input = "geeksforgeeks a computer science portal for geeks";
        String[] inputArray = input.split(" ");

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(getReverse(inputArray[i]) + " ");
        }

        System.out.println();

        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(getReverse(inputArray[i]) + " ");
        }

        String s = "bbccdefbbaa";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String b = String.valueOf(charArray);
        System.out.println(new StringBuilder(b).reverse());
    }

    private static String getReverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
