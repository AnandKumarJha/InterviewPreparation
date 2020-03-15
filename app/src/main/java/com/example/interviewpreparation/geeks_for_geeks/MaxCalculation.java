package com.example.interviewpreparation.geeks_for_geeks;

//Input : 01231
//        Output :
//        ((((0 + 1) + 2) * 3) + 1) = 10
//        In above manner, we get the maximum value i.e. 10
//
//        Input : 891
//        Output :73
//        As 8*9*1 = 72 and 8*9+1 = 73.So, 73 is maximum.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxCalculation {
    public static void main(String[] args) {
        String input = "01231";
        List<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            inputs.add(Integer.parseInt("" + input.charAt(i)));
        }
//        Collections.sort(inputs);

        int finalResult = 0;
        Iterator iterator = inputs.iterator();
        while (iterator.hasNext()) {
//            System.out.println("---" + iterator.next());
            Integer oneChar = (Integer) iterator.next();
            if (oneChar == 0 || oneChar == 1) {
                finalResult = finalResult + oneChar;
            } else {
                if(finalResult==0) finalResult = 1;
                finalResult = finalResult * oneChar;
            }
            System.out.println("Result : " + finalResult);
        }
        System.out.println("Final Result : " + finalResult);
    }
}
