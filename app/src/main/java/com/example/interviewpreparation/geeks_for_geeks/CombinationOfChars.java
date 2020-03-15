package com.example.interviewpreparation.geeks_for_geeks;

public class CombinationOfChars {

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c'};
        int count=0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                for (int k = 0; k < charArray.length; k++) {
                    System.out.println(""+charArray[i] + charArray[j] + charArray[k]);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
