package com.example.interviewpreparation.geeks_for_geeks;

public class PringRotation {
    public static void main(String[] args) {
        String input = "geeks";
        for (int i = 0; i < input.length(); i++) {
            input = rotate(input);
            System.out.println(input);
        }

        System.out.println(rotate("geeksforgeeks a computer science portal for geeks"));
    }

    private static String rotate(String input) {
        char[] charArray = input.toCharArray();
        char tempChar;
        for (int i = 0; i < charArray.length; i++) {
            if(i+1<charArray.length) {
                tempChar = charArray[i];
                charArray[i] = charArray[i + 1];
                charArray[i + 1] = tempChar;
            }
        }
        return String.valueOf(charArray);
    }
}
