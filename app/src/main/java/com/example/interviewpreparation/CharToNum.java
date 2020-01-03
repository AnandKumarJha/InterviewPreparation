package com.example.interviewpreparation;

public class CharToNum {
    public static void main(String[] args){
        String input = "ANAND";
        int c;
        for(int i=0; i<input.length(); i++){
            c = (int)input.charAt(i);
            System.out.print(c-64);
        }
    }
}
