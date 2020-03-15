package com.example.interviewpreparation.geeks_for_geeks;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "100001";
        int length = s.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int single = Integer.parseInt("" + s.charAt(i));
            sum += single*Math.pow(2, (length-i-1));
        }
        int a = '4'-'0';
        System.out.println(5%6);
    }
}
