package com.example.interviewpreparation.geeks_for_geeks;

public class CommonCharsOfString {
    public static void main(String[] args) {
        String input = "aacdb", input1 = "gafd", temp;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            temp = "" + input.charAt(i);
            if (input1.contains(temp) && !stringBuilder.toString().contains(temp)) {
                stringBuilder.append(temp);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
