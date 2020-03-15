package com.example.interviewpreparation.geeks_for_geeks;

public class CharPositionRightOrNotForAlphabets {
    public static void main(String[] args) {
        String input = "alphabetical";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.charAt(i) - 'A' || i == input.charAt(i) - 'a') {
                count++;
            }
        }

        System.out.println(count);
    }
}
