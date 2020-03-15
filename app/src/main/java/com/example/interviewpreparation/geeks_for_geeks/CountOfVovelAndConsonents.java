package com.example.interviewpreparation.geeks_for_geeks;

public class CountOfVovelAndConsonents {

    private static String removeVowelFromString(String s){
        return s.replaceAll("[a,e,i,o,u,A,I,O,U,E]", "");
    }

    public static void main(String[] args) {
        String input = "This is my testing";
        char temp;
        int vowelCount = 0, consonentCount = 0;

        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if ((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')) {
                if (temp == 'A' || temp == 'I' || temp == 'O' || temp == 'U' || temp == 'E' || temp == 'a' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'e') {
                    vowelCount++;
                } else {
                    consonentCount++;
                }
            }
        }

        System.out.println("vowelCount : " + vowelCount + " consonentCount : " + consonentCount);
        System.out.println("Removed vowels from the sring : "+removeVowelFromString(input));
    }
}
