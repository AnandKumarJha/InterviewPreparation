package com.example.interviewpreparation.geeks_for_geeks;

public class RemainderOfString {
    public static void main(String[] args){
        String input  = "3435346456547566345436457867978";
        int rem=0, num=0;
        for(int i=0; i<input.length(); i++){
            num = (rem*10) + (input.charAt(i)-'0');
            rem = num % 11;
        }

        System.out.println(rem);
    }
}
