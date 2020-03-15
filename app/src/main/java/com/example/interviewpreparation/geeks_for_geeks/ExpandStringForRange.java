package com.example.interviewpreparation.geeks_for_geeks;

public class ExpandStringForRange {
    public static void main(String[] main) {
        String input = "1-3, 4, 5, 6, 7-10";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                expand(stringBuilder, input.charAt(i-1), input.charAt(i+1));
            }else {
                if((i-1<input.length()) && i!=0 && input.charAt(i-1) != '-') {
                    stringBuilder.append(input.charAt(i));
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void expand(StringBuilder input, char left, char right) {
        int a = Integer.parseInt(""+left);
        int b = Integer.parseInt(""+right);
        for(int i=a; i<=b; i++){
            input.append(", "+i);
        }
    }
}
