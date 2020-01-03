package com.example.interviewpreparation;

public class GCD {

    public static void main(String[] args) {
        System.out.println(findGCD(15, 5));
    }

    private static int findGCD(int val1, int val2) {
        int remainder = val1 % val2;
        return (remainder == 0) ? val2 : findGCD(val2, remainder);
    }

}
