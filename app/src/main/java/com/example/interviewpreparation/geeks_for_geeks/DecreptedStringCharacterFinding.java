package com.example.interviewpreparation.geeks_for_geeks;

public class DecreptedStringCharacterFinding {
    public static void main(String[] args) {
        String input = "ab4c2ed3";
        StringBuilder stringBuilder = new StringBuilder();
        String tempString = "";
        int loopCount = 0;
        char temp;
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if ((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')) {
                tempString += temp;
            } else if (temp >= '0' && temp <= '9') {
                loopCount = temp - '0';
                for (int single = 0; single < loopCount; single++) {
                    stringBuilder.append(tempString);
                }
                tempString = "";
            }
        }

        System.out.println(stringBuilder.toString().charAt(8));
    }
}
