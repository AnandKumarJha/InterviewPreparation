package com.example.interviewpreparation;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 0, 9, 8, 1, 3, 6, 5, 7};
        int largest_num1 = 0, largest_num2 = 0;
        for (int i : arr) {
            if (largest_num1 < i) {
                largest_num2 = largest_num1;
                largest_num1 = i;
            } else {
                if (largest_num2 < i) {
                    largest_num2 = i;
                }
            }
        }

        System.out.println(largest_num2);
    }

}
